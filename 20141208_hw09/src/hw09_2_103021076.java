/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: ���j�m��(��XA,B�̤j���]��)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw09_2_103021076 {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.println("��J���:");
		System.out.print("A = ");
		int a = scn.nextInt();
		System.out.print("B = ");
		int b = scn.nextInt();
		System.out.println("�̤j���]��: " + gcd(a, b));
	}
	private static int gcd(int m, int n) {
		if(n == 0){
			return m;
		}else{
			return gcd(n, m%n);
		}
	}
}