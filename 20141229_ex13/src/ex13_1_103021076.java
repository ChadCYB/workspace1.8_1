/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: �ϥΪ̿�J���n�A�P�_n���X����j��10000
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex13_1_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@���:");
		int n = scn.nextInt(), count=0;
		while(Math.pow(n,count++)<= 10000);
		System.out.println(n+"��"+(count-1)+"����j��10000");
	}
}
