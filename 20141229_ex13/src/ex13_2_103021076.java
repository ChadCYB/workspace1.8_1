/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: 使用者輸入整數n，判斷(1+2+...+m<=n)的最大整數m
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex13_2_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一整數:");
		int n = scn.nextInt(), m=0, sum=0;
		do{
			sum += ++m;
		}while(sum <= n);
		System.out.println("1+...+m<="+n+"的最大整數m="+(m-1));
	}
}
