/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/27
 * 	Uses: ��for�j�鶥��
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex05_4_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J����:");
		int n = scn.nextInt();
		System.out.print(fuc(n));
	}
	static int fuc(int n){
		int sum = 1;
		for(int i=n;i>0;i--){
			System.out.print(i+((i==1)?" = ":" X "));
			sum = sum*i;
		}
		return sum;
	}
}