/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: �Ʀr��[�`
 */
import java.util.Scanner;
public class ex03_1_103021076 {
	public static void main(String[] args) {
		int num,sum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�n�p�⪺�Ʀr�Ӽ�: ");
		int count = scn.nextInt();
		for (int i=0;i<count;i++){
			System.out.print("�п�J��"+(i+1)+"�ӼƦr: ");
			num = scn.nextInt();
			sum = sum+num;
		}
		System.out.print("����J���Ʀr�`�X��: "+sum);
	}
}
