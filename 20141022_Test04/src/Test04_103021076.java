/*	�m�W: �����e
 * 	�Ǹ�: 103021076
 * 	���: 2014/10/22
 * 	�γ~: �p��}�C�̤j��,�̤p��,����(���O��)
 * 	����/���x: JDK1.8/Ubuntu
 */
import java.util.Random;

public class Test04_103021076 {
	Random rand = new Random();
	float a[][] = new float[100][100];
	float b[][] = new float[100][3];
	float c[][] = new float[100][3];
	float d[] = new float[3];

	public static void main(String[] args) { 
		DoRun run = new DoRun();
	}
}
class DoRun{
	static float maxNum, minNum, midNum, absNum, medNum, medNum1;
	public DoRun(){
		int i,j;
		Test04_103021076 adf=new Test04_103021076();
		for(i=0 ; i<adf.a.length ; i++){
			maxNum=0; minNum=255; midNum=0;	absNum=0; medNum=255; medNum1=0;
			for(j=0 ; j<adf.a[i].length ; j++){
				adf.a[i][j]=adf.rand.nextFloat()*256;
				System.out.print(adf.a[i][j]+"   \t");		
				if(maxNum < adf.a[i][j]){	//��P�_Max,Min
					maxNum = adf.a[i][j];
				}else if(minNum > adf.a[i][j]){
					minNum = adf.a[i][j];
				}
			}
			midNum = (maxNum + minNum)/2;		//������
			for(j=0 ; j<adf.a[i].length ; j++){		//���ȧP�_
				adf.b[i][2] = findmedNum(adf.a[i][j]);
			}
			adf.b[i][0] = maxNum;
			adf.b[i][1] = minNum;
			System.out.println("");
		}
	
		for(j=0 ; j<adf.a[0].length ; j++){
			maxNum=0; minNum=255; midNum=0;	absNum=0; medNum=255; medNum1=0;
			for(i=0 ; i<adf.a.length ; i++){	//�C�P�_Max,Min
				if(maxNum < adf.a[i][j]){
					maxNum = adf.a[i][j];
				}else if(minNum > adf.a[i][j]){
					minNum = adf.a[i][j];
				}
			}
			midNum = (maxNum + minNum)/2;		//������
			for(i=0 ; i<adf.a.length ; i++){		//���ȧP�_
				adf.c[j][2] = findmedNum(adf.a[i][j]);
			}
			adf.c[j][0] = maxNum;
			adf.c[j][1] = minNum;
		}
	
		for(i=0 ; i<adf.a.length ; i++){
			maxNum=0; minNum=255; midNum=0;	absNum=0; medNum=255; medNum1=0;
			for(j=0 ; j<adf.a[i].length ; j++){
				if(maxNum < adf.a[i][j]){	//�P�_Max,Min
					maxNum = adf.a[i][j];
				}else if(minNum > adf.a[i][j]){
					minNum = adf.a[i][j];
				}
			}
			midNum = (maxNum + minNum)/2;		//������
			for(j=0 ; j<adf.a[i].length ; j++){		//���ȧP�_
				adf.d[2] = findmedNum(adf.a[i][j]);
			}
			adf.d[0] = maxNum;
			adf.d[1] = minNum;
		}		
		for(i=0 ; i<(adf.a.length) ; i++){		//���X
			System.out.print("��"+(i+1)+"��:\t");
			System.out.println("�̤j��: "+ adf.b[i][0] +"    \t�̤p��:"+ adf.b[i][1] +"    \t����:"+ adf.b[i][2] );
		}
		for(i=0 ; i<(adf.a[0].length) ; i++){	//�C��X
			System.out.print("��"+(i+1)+"�C:\t");
			System.out.println("�̤j��: "+ adf.c[i][0] +"    \t�̤p��:"+ adf.c[i][1] +"    \t����:"+ adf.c[i][2] );
		}
		System.out.print("�Ҧ���: \t");
		System.out.println("�̤j��: "+ adf.d[0] +"    \t�̤p��:"+ adf.d[1] +"    \t����:"+ adf.d[2] );
	}
	private static float findmedNum(float input) {
		absNum = Math.abs(input-midNum);
		if(medNum > absNum){
			medNum = absNum;
			medNum1 = input;
		}
		return medNum1;
	}
}