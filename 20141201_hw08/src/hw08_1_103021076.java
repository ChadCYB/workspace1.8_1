/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: 判斷大小寫或是其他字元
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw08_1_103021076 {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個字元:");
		char chrIn = scn.next().charAt(0);
		int asciCode = (int)(chrIn);
		if(65<=asciCode && asciCode<=90){			//ASCII 大寫英文
			System.out.println(chrIn+"是大寫英文字元");
		}else if(97<=asciCode && asciCode<=122){	//ASCII 小寫英文
			System.out.println(chrIn+"是小寫英文字元");
		}else{
			System.out.println(chrIn+"是其他字元");
		}
	}
}
