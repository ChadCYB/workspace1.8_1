/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: 輸出方陣
 * 	ex: n=5
 *  1	3	6	10	15
 *  2	5	9	14	19
 *  4	8	13	18	22
 *  7	12	17	21	24
 *  11	16	20	23	25
 *  Java JDK: 1.8
 */
import java.util.Scanner;

public class hw10_3_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入方陣大小n:");
		int n = scn.nextInt();
		int[][] data = new int[n][n];
		creatAry(data);
		showAry(data);
	}
	
	private static void creatAry(int[][] data) {
		int i,j,start,count=1;
		for(start=0;start<data.length;start++){		//不動Y軸，動X軸
			i=start;
			j=0;
			do{
				data[i][j]=count;	//丟數值
				count++;			//計數
				j++; i--;			//向右上移動
			}while(i>=0 && j<data.length);	//判斷是否出邊緣
		}
		for(start=1;start<data.length;start++){		//X軸已到底，開始動Y軸
			i=data.length-1;
			j=start;
			do{
				data[i][j]=count;	//丟數值
				count++;			//計數
				j++; i--;			//向右上移動
			}while(i>=0 && j<data.length);	//判斷是否出邊緣
		}
	}
	private static void showAry(int[][] data) {
		int i,j;
		for(i=0;i<data.length;i++){
			for(j=0;j<data[i].length;j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
