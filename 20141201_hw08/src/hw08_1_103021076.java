/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: �P�_�j�p�g�άO��L�r��
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw08_1_103021076 {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�Ӧr��:");
		char chrIn = scn.next().charAt(0);
		int asciCode = (int)(chrIn);
		if(65<=asciCode && asciCode<=90){			//ASCII �j�g�^��
			System.out.println(chrIn+"�O�j�g�^��r��");
		}else if(97<=asciCode && asciCode<=122){	//ASCII �p�g�^��
			System.out.println(chrIn+"�O�p�g�^��r��");
		}else{
			System.out.println(chrIn+"�O��L�r��");
		}
	}
}
