/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: �C�L��ߥ����
 * 	Java JDK: 1.8
 */
import java.util.Scanner;

public class ex04_1_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J����Τj�p:");
		int n = scn.nextInt();
		System.out.print("�n��ܪ��r:");
		String c = scn.next();
		Square(n,c);
	}
	static void Square(int n, String c){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
