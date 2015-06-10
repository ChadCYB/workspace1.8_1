/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: 攝氏轉華氏
 */
import java.util.Scanner;
public class ex03_2_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入攝氏: ");
		int c = scn.nextInt();
		int f = c*9/5+32;
		System.out.println("攝氏 "+c+" 度 = 華氏 "+f+" 度");
	}
}
