/*	姓名: 陳奕呈
 * 	學號: 103021076
 * 	日期: 2014/10/22
 * 	用途: 計算陣列最大值,最小值,中值(類別化)
 * 	版本/平台: JDK1.8/Ubuntu
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
				if(maxNum < adf.a[i][j]){	//行判斷Max,Min
					maxNum = adf.a[i][j];
				}else if(minNum > adf.a[i][j]){
					minNum = adf.a[i][j];
				}
			}
			midNum = (maxNum + minNum)/2;		//中間值
			for(j=0 ; j<adf.a[i].length ; j++){		//中值判斷
				adf.b[i][2] = findmedNum(adf.a[i][j]);
			}
			adf.b[i][0] = maxNum;
			adf.b[i][1] = minNum;
			System.out.println("");
		}
	
		for(j=0 ; j<adf.a[0].length ; j++){
			maxNum=0; minNum=255; midNum=0;	absNum=0; medNum=255; medNum1=0;
			for(i=0 ; i<adf.a.length ; i++){	//列判斷Max,Min
				if(maxNum < adf.a[i][j]){
					maxNum = adf.a[i][j];
				}else if(minNum > adf.a[i][j]){
					minNum = adf.a[i][j];
				}
			}
			midNum = (maxNum + minNum)/2;		//中間值
			for(i=0 ; i<adf.a.length ; i++){		//中值判斷
				adf.c[j][2] = findmedNum(adf.a[i][j]);
			}
			adf.c[j][0] = maxNum;
			adf.c[j][1] = minNum;
		}
	
		for(i=0 ; i<adf.a.length ; i++){
			maxNum=0; minNum=255; midNum=0;	absNum=0; medNum=255; medNum1=0;
			for(j=0 ; j<adf.a[i].length ; j++){
				if(maxNum < adf.a[i][j]){	//判斷Max,Min
					maxNum = adf.a[i][j];
				}else if(minNum > adf.a[i][j]){
					minNum = adf.a[i][j];
				}
			}
			midNum = (maxNum + minNum)/2;		//中間值
			for(j=0 ; j<adf.a[i].length ; j++){		//中值判斷
				adf.d[2] = findmedNum(adf.a[i][j]);
			}
			adf.d[0] = maxNum;
			adf.d[1] = minNum;
		}		
		for(i=0 ; i<(adf.a.length) ; i++){		//行輸出
			System.out.print("第"+(i+1)+"行:\t");
			System.out.println("最大值: "+ adf.b[i][0] +"    \t最小值:"+ adf.b[i][1] +"    \t中值:"+ adf.b[i][2] );
		}
		for(i=0 ; i<(adf.a[0].length) ; i++){	//列輸出
			System.out.print("第"+(i+1)+"列:\t");
			System.out.println("最大值: "+ adf.c[i][0] +"    \t最小值:"+ adf.c[i][1] +"    \t中值:"+ adf.c[i][2] );
		}
		System.out.print("所有值: \t");
		System.out.println("最大值: "+ adf.d[0] +"    \t最小值:"+ adf.d[1] +"    \t中值:"+ adf.d[2] );
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