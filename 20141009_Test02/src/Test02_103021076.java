/*	姓名: 陳奕呈
 * 	學號: 103021076
 * 	日期: 2014/10/09
 * 	用途: 計算陣列最大值,最小值,中值
 */
import java.util.Random;

public class Test02_103021076 {
	public static void main(String[] args) { 
		Random rand = new Random();
		float a[][] = new float[100][100];
		float b[][] = new float[100][3];
		float c[][] = new float[100][3];
		float d[] = new float[3];
		int i,j;
		for(i=0 ; i<a.length ; i++){
			float maxNum=0, minNum=255, midNum=0, absNum=0, medNum=255, medNum1=0;
			for(j=0 ; j<a[i].length ; j++){
				a[i][j]=rand.nextFloat()*256;
				System.out.print(a[i][j]+"\t");		
				if(maxNum < a[i][j]){	//行判斷Max,Min
					maxNum = a[i][j];
				}else if(minNum > a[i][j]){
					minNum = a[i][j];
				}
			}
			midNum = (maxNum + minNum)/2;		//中間值
			for(j=0 ; j<a[i].length ; j++){		//中值判斷
				absNum = Math.abs(a[i][j]-midNum);
				if(medNum > absNum){
					medNum = absNum;
					medNum1 = a[i][j];
				}
			}
			b[i][0] = maxNum;
			b[i][1] = minNum;
			b[i][2] = medNum1;
			System.out.println("");
		}

		for(j=0 ; j<a[0].length ; j++){
			float maxNum=0, minNum=255, midNum=0, absNum=0, medNum=255, medNum1=0;
			for(i=0 ; i<a.length ; i++){	//列判斷Max,Min
				if(maxNum < a[i][j]){
					maxNum = a[i][j];
				}else if(minNum > a[i][j]){
					minNum = a[i][j];
				}
			}
			midNum = (maxNum + minNum)/2;		//中間值
			for(i=0 ; i<a.length ; i++){		//中值判斷
				absNum = Math.abs(a[i][j]-midNum);
				if(medNum > absNum){
					medNum = absNum;
					medNum1 = a[i][j];
				}
			}
			c[j][0] = maxNum;
			c[j][1] = minNum;
			c[j][2] = medNum1;
		}

		for(i=0 ; i<(a.length) ; i++){		//行輸出
			System.out.print("第"+(i+1)+"行:\t");
			System.out.println("最大值: "+ b[i][0] +"\t 最小值: "+ b[i][1] +"\t 中值: "+ b[i][2] );
		}
		for(i=0 ; i<(a[0].length) ; i++){	//列輸出
			System.out.print("第"+(i+1)+"列:\t");
			System.out.println("最大值: "+ c[i][0] +"\t 最小值: "+ c[i][1] +"\t 中值: "+ c[i][2] );
		}
		for(i=0 ; i<a.length ; i++){
			float maxNum=0, minNum=255, midNum=0, absNum=0, medNum=255, medNum1=0;
			for(j=0 ; j<a[i].length ; j++){
				if(maxNum < a[i][j]){	//判斷Max,Min
					maxNum = a[i][j];
				}else if(minNum > a[i][j]){
					minNum = a[i][j];
				}
			}
			midNum = (maxNum + minNum)/2;		//中間值
			for(j=0 ; j<a[i].length ; j++){		//中值判斷
				absNum = Math.abs(a[i][j]-midNum);
				if(medNum > absNum){
					medNum = absNum;
					medNum1 = a[i][j];
				}
			}
			d[0] = maxNum;
			d[1] = minNum;
			d[2] = medNum1;
		}
		System.out.print("所有值: \t");
		System.out.println("最大值:"+ d[0] +"\t 最小值:"+ d[1] +"\t 中值:"+ d[2] );
	}

}