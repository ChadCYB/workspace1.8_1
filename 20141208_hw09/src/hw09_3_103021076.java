/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: 取火柴遊戲(每回合使用者和電腦可以取走1~3，到最後一根為輸家)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw09_3_103021076 {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		int stick = 12, canTake=3, status=3;
		System.out.print("請選擇誰先(1)電腦(2)玩家:");
		int mode=scn.nextInt();
		do{
			System.out.println("目前有"+stick+"根火柴");
			canTake = ((stick<3)?stick:3);
			switch(mode){
			case 1:	//電腦
				stick -= cpuTurn(canTake);
				status=(stick==0)?1:3;
				mode=2;
				break;
			case 2:	//玩家
				stick -= playerTurn(canTake,scn);
				status=(stick==0)?2:3;
				mode=1;
				break;
			default:
				status=0;
				break;
			}
			System.out.println("=====================");
		}while(status==3);	//status 0:錯誤 1:電腦輸 2:玩家輸
		switch(status){
		case 0:
			System.out.println(">>>輸入錯誤<<<");
			break;
		case 1:
			System.out.println(">>>玩家贏<<<");
			break;
		case 2:
			System.out.println(">>>電腦贏<<<");
			break;
		}
	}
	private static int playerTurn(int take, Scanner scn){
		int playerTake=0;
		System.out.println("請拿1~"+take);
		do{
			System.out.print("玩家:");
			playerTake = scn.nextInt();
		}while(playerTake>take || playerTake<=0);
		return playerTake;
	}
	private static int cpuTurn(int take){
		int cpuTake = (int)(Math.random()*take)+1;
		System.out.println("電腦:"+cpuTake);
		return cpuTake;
	}
}
