/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: 成績總和，平均
 */
import java.util.Scanner;
public class ex03_5_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score1,score2,score3;
		System.out.print("請輸入國文成績: ");
		score1 = scn.nextInt();
		System.out.print("請輸入英文成績: ");
		score2 = scn.nextInt();
		System.out.print("請輸入數學成績: ");
		score3 = scn.nextInt();
		System.out.println("成績總和: "+(float)(score1+score2+score3));
		System.out.println("平均分數: "+(float)(score1+score2+score3)/3);
	}
}
