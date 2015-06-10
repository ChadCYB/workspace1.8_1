/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: 遞迴練習(判斷有幾位數)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw09_1_103021076 {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入整數:");
		long num = scn.nextLong();
		System.out.println("共有"+digits(num,0)+"位數");
	}
	private static int digits(long m,int n){
		if(m!=0){
			n++;
			return digits(m/10, n);		// M/10之後回傳，N++代表一位數
		}else{
			return n;
		}
	}
}
