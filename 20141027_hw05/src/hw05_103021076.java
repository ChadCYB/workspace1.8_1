/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: While�j��m�ߡA��X�T����
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw05_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�˦�(1)��(2)��:");
		int mod = scn.nextInt();
		System.out.print("�п�J����:");
		int n = scn.nextInt();
		System.out.print("�n��ܪ��r:");
		String c = scn.next();
		Square(mod,n,c);
	}
	static void Square(int mod, int n, String c){
		int i,j;
		switch(mod){
			case 1:
				i=n;
				while(i>0){
					j=0;
					while(j<i){
						System.out.print(c);	j++;
					}
					System.out.println();	i--;
				}
				break;
			case 2:
				i=0;
				while(i<n){
					j=0;
					while(j<=i){
						System.out.print(c);	j++;
					}
					System.out.println();	i++;
				}
				break;
		}
	}
}
