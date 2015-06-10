/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: 函數練習(輸出一個寬*高的表)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex09_4_103021076{
	public static void main(String [] argv){
    	Scanner scn = new Scanner(System.in);
    	System.out.print("請輸入寬:");
    	int w = scn.nextInt();
    	System.out.print("請輸入高:");
    	int h = scn.nextInt();
    	square(w,h);
	}
	private static void square(int w,int h){
		int i,j;
		for(i=1;i<=h;i++){
			for(j=1;j<=w;j++){
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}
}
