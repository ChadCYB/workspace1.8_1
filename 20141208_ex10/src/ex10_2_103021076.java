/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: �q1~100�ü�
 *  Java JDK: 1.8
 */
import java.util.Scanner;
public class ex10_2_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int inNum,randNum,start,end;
		start=1; end=100;
		randNum = (int)(Math.random()*100)+1;
		do{
			System.out.print("�q���"+start+"~"+end+":");
			inNum = scn.nextInt();
			if(inNum>randNum){
				System.out.println("�Ӥj");
				end = (inNum<end)?inNum:end;
			}else if(inNum<randNum){
				System.out.println("�Ӥp");
				start = (inNum>start)?inNum:start;
			}
		}while(inNum!=randNum);
		System.out.println("����");
	}
}
