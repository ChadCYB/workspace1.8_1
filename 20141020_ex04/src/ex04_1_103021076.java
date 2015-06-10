/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: 列印實心正方形
 * 	Java JDK: 1.8
 */
import java.util.Scanner;

public class ex04_1_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正方形大小:");
		int n = scn.nextInt();
		System.out.print("要顯示的字:");
		String c = scn.next();
		Square(n,c);
	}
	static void Square(int n, String c){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
