/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 輸出"◢"三角形
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw06_6_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n:");
		int h = scn.nextInt();
		int num1=1+(h-1)*2;
		int num2=h-1;
		for(int i=1;i<=h;i++,num2--){
			for(int k=num2;k>=1;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
