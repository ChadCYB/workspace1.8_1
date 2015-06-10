/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/21
 * 	Uses: 判斷 N 要多少次方才會大於 10000
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class exam04 {
	public static void main(String[] arg){
		Scanner scn = new Scanner(System.in);
		int n,i=1,ans;
		System.out.print("請輸入n:");
		n = scn.nextInt();
		do{
			ans = (int)Math.pow(n,i);
			i++;
			System.out.println(n+"的"+i+"次方 = "+ans);
		}while(ans<=10000);
	}
}