/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: 迴文(palindrome)判斷
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw07_3_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個字串: ");
		String str1 = scn.next();
		String str2 = new StringBuffer(str1).reverse().toString();
		System.out.print(str1+" 與 "+str2);
		System.out.println((str2.equals(str1))?" 是迴文":" 不是迴文");
	}
}
