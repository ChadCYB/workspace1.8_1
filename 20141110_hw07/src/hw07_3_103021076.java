/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: �j��(palindrome)�P�_
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw07_3_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�Ӧr��: ");
		String str1 = scn.next();
		String str2 = new StringBuffer(str1).reverse().toString();
		System.out.print(str1+" �P "+str2);
		System.out.println((str2.equals(str1))?" �O�j��":" ���O�j��");
	}
}
