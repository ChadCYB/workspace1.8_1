/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: �ϥΪ̿�J���n�A�P�_(1+2+...+m<=n)���̤j���m
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex13_2_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@���:");
		int n = scn.nextInt(), m=0, sum=0;
		do{
			sum += ++m;
		}while(sum <= n);
		System.out.println("1+...+m<="+n+"���̤j���m="+(m-1));
	}
}
