/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: �j�p�g�ഫ��
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex09_2_103021076{
	public static void main(String [] argv){
    	Scanner scn = new Scanner(System.in);
    	System.out.print("�п�J�^��r��:");
    	String strIn = scn.next();
		int asciCode = (int)(strIn.charAt(0));
		if(65<=asciCode && asciCode<=90){
			System.out.println(strIn+"-->"+strIn.toLowerCase());	//�ഫ���j�g
		}else{
			System.out.println(strIn+"-->"+strIn.toUpperCase());	//�ഫ���p�g
		}
	}
}
