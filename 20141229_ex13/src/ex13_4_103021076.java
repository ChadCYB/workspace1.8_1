/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: 使用者輸入整數n，遞迴回傳該數字的2進位有幾個1
 *  input: 13	output: 1101 >> 3
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex13_4_103021076 {
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一整數:");
		int n = scn.nextInt();
		System.out.print(Integer.toBinaryString(n)+" >> "+find1(n,0));
	}
	private static int find1(int input, int count){
		if(input%2==1)	count++;
		if(input/2==0){
			return count;
		}else{
			return find1(input/2,count);	
		}
	}
}
