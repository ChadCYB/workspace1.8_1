/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: ���Z�`�M�A����
 */
import java.util.Scanner;
public class ex03_5_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score1,score2,score3;
		System.out.print("�п�J��妨�Z: ");
		score1 = scn.nextInt();
		System.out.print("�п�J�^�妨�Z: ");
		score2 = scn.nextInt();
		System.out.print("�п�J�ƾǦ��Z: ");
		score3 = scn.nextInt();
		System.out.println("���Z�`�M: "+(float)(score1+score2+score3));
		System.out.println("��������: "+(float)(score1+score2+score3)/3);
	}
}
