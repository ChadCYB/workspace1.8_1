/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: ��ư��ƧP�_
 * 	Java JDK: 1.8
 */
import java.util.Scanner;

public class ex04_4_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ʀr:");
		int num = scn.nextInt();
		fuc(num);
	}
	static void fuc(int num){
		System.out.println(((num%2)==0)?(num+"������"):(num+"�����"));	
	}
}