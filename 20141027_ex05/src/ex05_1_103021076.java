/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/27
 * 	Uses: �P�_�O���@�ؤT����
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex05_1_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int val1,val2,val3,temp;
		System.out.print("�п�J�Ĥ@���:");
		val1 = scn.nextInt();
		System.out.print("�п�J�ĤG���:");
		val2 = scn.nextInt();
		System.out.print("�п�J�ĤT���:");
		val3 = scn.nextInt();
		if(val2>val1){
			temp = val1;
			val1 = val2;
			val2 = temp;
		}
		if(val3>val1){
			temp = val1;
			val1 = val3;
			val3 = temp;
		}
		if(val2>val3){
			temp = val2;
			val2 = val3;
			val3 = temp;
		}
		fuc(val1,val2,val3);
	}
	static void fuc(int a,int b,int c){		
		if(((a+b)>c)&&((b+c)>a)&&((c+a)>b)){
			if((b*b+c*c)==(a*a)){
				System.out.print(a+","+b+","+c+" �O�����T����");
			}else if((b*b+c*c)<(a*a)){
				System.out.print(a+","+b+","+c+" �O�w���T����");
			}else{
				System.out.print(a+","+b+","+c+" �O�U���T����");
			}
			
		}else{
			System.out.print(a+","+b+","+c+" ���O�X�k�T���");
		}
	}
}
