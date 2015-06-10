/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: 計算兩數和,差,乘機
 */
import java.util.Scanner;
public class ex03_4_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float val1=0,val2=0;
		System.out.print("請輸入A: ");
		val1 = scn.nextFloat();
		System.out.print("請輸入B: ");
		val2 = scn.nextFloat();
		System.out.println("A + B =\t"+(val1+val2));
		System.out.println("A - B =\t"+(val1-val2));
		System.out.println("A * B =\t"+(val1*val2));
	}
}
