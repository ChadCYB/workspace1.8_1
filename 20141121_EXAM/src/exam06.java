/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/21
 * 	Uses: ��Ƥ���
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class exam06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӥ����: ");
		String str1 = scn.next();
		String str2 = new StringBuffer(str1).reverse().toString();
		System.out.println(str1+" �� "+str1.length()+"���");
		System.out.println(str2);
		float i = Float.valueOf("1234");
	}
}
