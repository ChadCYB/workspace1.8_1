/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/20
 * 	Uses: �P�_�T���ΤT����O�_�X�k
 * 	Java JDK: 1.8
 */
import java.util.Scanner;

public class ex04_5_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ĥ@���:");
		int val1 = scn.nextInt();
		System.out.print("�п�J�ĤG���:");
		int val2 = scn.nextInt();
		System.out.print("�п�J�ĤT���:");
		int val3 = scn.nextInt();
		fuc(val1,val2,val3);
	}
	static void fuc(int a,int b,int c){
		if(((a+b)>c)&&((b+c)>a)&&((c+a)>b)){
			System.out.print(a+","+b+","+c+" ���X�k�T���");
		}else{
			System.out.print(a+","+b+","+c+" ���O�X�k�T���");
		}
	}
}