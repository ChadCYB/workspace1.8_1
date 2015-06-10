/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: 函數練習(計算C的m取n)，遞迴練習(N階層)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex09_5_103021076{
	public static void main(String [] argv){
    	Scanner scn = new Scanner(System.in);
    	System.out.println("C(m,n)");
    	System.out.print("請輸入m:");
    	int m = scn.nextInt();
    	System.out.print("請輸入n:");
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
