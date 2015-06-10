/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: 迴圈練習，輸出三角形
 * 	Java JDK: 1.8
 */
import java.util.Scanner;

public class hw04_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入樣式(1)◤(2)◣:");
		int mod = scn.nextInt();
		System.out.print("請輸入高度:");
		int n = scn.nextInt();
		System.out.print("要顯示的字:");
		String c = scn.next();
		Square(mod,n,c);
	}
	static void Square(int mod, int n, String c){
		int i,j;
		switch(mod){
			case 1:
				for(i=n;i>0;i--){
					for(j=0;j<i;j++){
						System.out.print(c);
					}
					System.out.println();
				}
				break;
			case 2:
				for(i=0;i<n;i++){
					for(j=0;j<=i;j++){
						System.out.print(c);
					}
					System.out.println();
				}
				break;
		}
	}
}
