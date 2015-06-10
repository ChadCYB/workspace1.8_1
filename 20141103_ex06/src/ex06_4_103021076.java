/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 亂數產生，判斷Max,Min
 * 	Java JDK: 1.8
 */
import java.util.Random;
import java.util.Scanner;
public class ex06_4_103021076 {
	public static void main(String[] args) { 
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		int i,ans=0,guess;
		ans=rand.nextInt(5)+1;
		System.out.print("電腦已選好數字了，請猜數字1~5:");	
		guess=scn.nextInt();
		System.out.print((guess==ans)?"很好，你猜對了":"Oops，你猜錯了，答案是"+ans+"~~");
	}
}