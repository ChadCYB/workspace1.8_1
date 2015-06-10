/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/21
 * 	Uses: 整數反轉
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class exam06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個正整數: ");
		String str1 = scn.next();
		String str2 = new StringBuffer(str1).reverse().toString();
		System.out.println(str1+" 為 "+str1.length()+"位數");
		System.out.println(str2);
		float i = Float.valueOf("1234");
	}
}
