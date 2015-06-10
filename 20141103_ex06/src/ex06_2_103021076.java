/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 亂數產生陣列，輸出轉置陣列
 * 	Java JDK: 1.8
 */
import java.util.Random;
public class ex06_2_103021076 {
	public static void main(String[] args) {
		Random rand = new Random();
		int a[][] = new int[10][10];
		int i,j;
		System.out.println("電腦產生了10 X 10的亂數陣列如下:");
		for(i=0 ; i<a.length ; i++){
			for(j=0 ; j<a[i].length ; j++){
				a[i][j]=rand.nextInt(10)+1;
				System.out.print((a[i][j]<10)?a[i][j]+"  ":a[i][j]+" ");		
			}
			System.out.println();
		}
		System.out.println("轉置後10 X 10的亂數陣列如下:");
		for(i=0 ; i<a.length ; i++){
			for(j=0 ; j<a[i].length ; j++){
				System.out.print((a[j][i]<10)?a[j][i]+"  ":a[j][i]+" ");		
			}
			System.out.println();
		}
	}

}
