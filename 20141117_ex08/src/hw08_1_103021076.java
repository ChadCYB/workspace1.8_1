/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/17
 * 	Uses: while�j��,switch�P�_�m��(��J���Z�P�_)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw08_1_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0;
		String str = "Y",str1;
		while(str.equals("Y")||str.equals("y")){//while�j��P�_�O�_���ư�
			System.out.print("�п�J����:");
			a=scn.nextInt();		//���Z��ƿ�J
			switch(a/10){			//a/10��10��ư��P�_
			case 10:				//100��
				str1 = "A";
				break;
			case 9:					//99~90
				str1 = "A";
				break;
			case 8:					//89~80
				str1 = "B";
				break;
			case 7:					//79~70
				str1 = "C";
				break;
			case 6:					//69~60
				str1 = "D";
				break;
			default:				//�ѤU��(60�H�U)
				str1 = "E";
			}
			System.out.println("�A�����Z�O:"+str1);
			System.out.print("�O�_�~��(Y/N)?");
			str=scn.next();			//�O�_����
		}
		System.out.print("Bye Bye~");
	}
}
