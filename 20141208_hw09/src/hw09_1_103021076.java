/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: ���j�m��(�P�_���X���)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw09_1_103021076 {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���:");
		long num = scn.nextLong();
		System.out.println("�@��"+digits(num,0)+"���");
	}
	private static int digits(long m,int n){
		if(m!=0){
			n++;
			return digits(m/10, n);		// M/10����^�ǡAN++�N��@���
		}else{
			return n;
		}
	}
}
