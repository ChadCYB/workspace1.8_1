/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 *  Uses: 輸出平方，立方表
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex10_4_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int i,j;
		for(i=0;i<=10;i++){
			for(j=1;j<=3;j++){
				System.out.print((int)Math.pow(i,j)+"\t");
			}
			System.out.println();
		}
	}
}