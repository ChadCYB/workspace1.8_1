/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: ��ƽm��(�p��C��m��n)�A���j�m��(N���h)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex09_5_103021076{
	public static void main(String [] argv){
    	Scanner scn = new Scanner(System.in);
    	System.out.println("C(m,n)");
    	System.out.print("�п�Jm:");
    	int m = scn.nextInt();
    	System.out.print("�п�Jn:");
    	int n = scn.nextInt();
    	calC(m,n);
	}
	private static void calC(int m,int n){
		int ans=fuc(m)/(fuc(n)*fuc(m-n));
		System.out.println("C("+m+","+n+")="+ans); 	
	}
	public static int fuc(int num){
		if(num == 1)
			return 1;
		else
			return (num*fuc(num-1));
	}
}
