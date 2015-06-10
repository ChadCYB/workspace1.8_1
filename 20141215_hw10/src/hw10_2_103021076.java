/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: ���j�p��power(a,n)=a*n
 *  Java JDK: 1.8
 */
import java.util.*;

public class hw10_2_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("���j�p��power(a,n)=a*n");
		System.out.print("�п�Ja:");
		int a = scn.nextInt();
		System.out.print("�п�Jn:");
		int n = scn.nextInt();
		System.out.print("\n��k�@:\n a*power(a,n-1)");
		System.out.print("\n��k�G:\n power(a,n/2)*power(a,n/2) ��n������\n a*power(a,n-1) ��n���_��");
		System.out.print("\n�п�ܤ�k(1/2):");
		int mode = scn.nextInt();
		switch(mode){
		case 1:
			System.out.println("\nANS: "+power1(a,n));
			break;
		case 2:
			System.out.println("\nANS: "+power2(a,n));
			break;
		}
	}
	
	private static int power1(int a,int n) {
		if(n==1){
			return a;
		}else{
			return a * power1(a,n-1);
		}
	}
	private static int power2(int a,int n) {
		if(n==1){
			return a;
		}else{
			if(n%2==0){
				return power2(a,n/2)*power2(a,n/2);
			}else{
				return a*power2(a,n-1);
			}
		}
	}
}
