/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: ������C��(�C�^�X�ϥΪ̩M�q���i�H����1~3�A��̫�@�ڬ���a)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw09_3_103021076 {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		int stick = 12, canTake=3, status=3;
		System.out.print("�п�֥ܽ�(1)�q��(2)���a:");
		int mode=scn.nextInt();
		do{
			System.out.println("�ثe��"+stick+"�ڤ���");
			canTake = ((stick<3)?stick:3);
			switch(mode){
			case 1:	//�q��
				stick -= cpuTurn(canTake);
				status=(stick==0)?1:3;
				mode=2;
				break;
			case 2:	//���a
				stick -= playerTurn(canTake,scn);
				status=(stick==0)?2:3;
				mode=1;
				break;
			default:
				status=0;
				break;
			}
			System.out.println("=====================");
		}while(status==3);	//status 0:���~ 1:�q���� 2:���a��
		switch(status){
		case 0:
			System.out.println(">>>��J���~<<<");
			break;
		case 1:
			System.out.println(">>>���aĹ<<<");
			break;
		case 2:
			System.out.println(">>>�q��Ĺ<<<");
			break;
		}
	}
	private static int playerTurn(int take, Scanner scn){
		int playerTake=0;
		System.out.println("�Ю�1~"+take);
		do{
			System.out.print("���a:");
			playerTake = scn.nextInt();
		}while(playerTake>take || playerTake<=0);
		return playerTake;
	}
	private static int cpuTurn(int take){
		int cpuTake = (int)(Math.random()*take)+1;
		System.out.println("�q��:"+cpuTake);
		return cpuTake;
	}
}
