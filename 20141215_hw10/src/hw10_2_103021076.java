/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: 遞迴計算power(a,n)=a*n
 *  Java JDK: 1.8
 */
import java.util.*;

public class hw10_2_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("遞迴計算power(a,n)=a*n");
		System.out.print("請輸入a:");
		int a = scn.nextInt();
		System.out.print("請輸入n:");
		int n = scn.nextInt();
		System.out.print("\n方法一:\n a*power(a,n-1)");
		System.out.print("\n方法二:\n power(a,n/2)*power(a,n/2) 當n為偶數\n a*power(a,n-1) 當n為奇數");
		System.out.print("\n請選擇方法(1/2):");
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
