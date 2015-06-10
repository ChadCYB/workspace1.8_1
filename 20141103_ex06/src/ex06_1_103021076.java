/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 字串反轉
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex06_1_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個字串: ");
		String s = new StringBuffer(scn.next()).reverse().toString();
		System.out.println(s);		
	}
}
