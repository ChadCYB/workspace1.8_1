/*	Author: 朝
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: 膀计案计耞
 * 	Java JDK: 1.8
 */
import java.util.Scanner;

public class ex04_4_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("叫块计:");
		int num = scn.nextInt();
		fuc(num);
	}
	static void fuc(int num){
		System.out.println(((num%2)==0)?(num+"案计"):(num+"膀计"));	
	}
}