/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 亂數產生陣列5*7，輸出轉置陣列
 * 	Java JDK: 1.8
 */
import java.util.Random;
public class hw06_3_103021076 {
	public static void main(String[] args) {
		Random rand = new Random();
		int a[][] = new int[5][7];
		int i,j;
		System.out.println("電腦產生了5 X 7的亂數陣列如下:");
		for(i=0 ; i<a.length ; i++){
			for(j=0 ; j<a[i].length ; j++){
				a[i][j]=rand.nextInt(10)+1;
				System.out.print((a[i][j]<10)?a[i][j]+"  ":a[i][j]+" ");		
			}
			System.out.println();
		}
		System.out.println("轉置後7 X 5的亂數陣列如下:");
		for(i=0 ; i<a[0].length ; i++){
			for(j=0 ; j<a.length ; j++){
				System.out.print((a[j][i]<10)?a[j][i]+"  ":a[j][i]+" ");		
			}
			System.out.println();
		}
	}

}

