/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: �üƲ��͡A�P�_Max,Min
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
		System.out.print("�q���w��n�Ʀr�F�A�вq�Ʀr1~5:");	
		guess=scn.nextInt();
		System.out.print((guess==ans)?"�ܦn�A�A�q��F":"Oops�A�A�q���F�A���׬O"+ans+"~~");
	}
}