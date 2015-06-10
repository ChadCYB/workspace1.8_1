/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: 輸入字串從中刪除空白字元
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class hw11_6_10321076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入字串:");
		String str = scn.nextLine();
		System.out.println("已刪除空白字串:"+str.replace(" ",""));
	}
}
