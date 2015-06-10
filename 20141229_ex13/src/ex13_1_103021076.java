/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: 使用者輸入整數n，判斷n的幾次方大於10000
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex13_1_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一整數:");
		int n = scn.nextInt(), count=0;
		while(Math.pow(n,count++)<= 10000);
		System.out.println(n+"的"+(count-1)+"次方大於10000");
	}
}
