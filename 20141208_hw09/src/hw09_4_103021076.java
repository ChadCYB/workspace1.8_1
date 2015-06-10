/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/08
 * 	Uses: 輸出1到 N 的質數
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw09_4_103021076{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num=2,count=0,n;
		System.out.print("請輸入n:");
		n = scn.nextInt();
		while(num<n){
			if(judge(num)){						//看回傳值判斷是否為質數
				System.out.print(num+"\t");
				count++;
				if(count%5==0)System.out.println();
			}
			
			num++;
		}
	}
	static boolean judge(int inNum){
		for(int m=2;m<(inNum);m++){
			if(inNum%m == 0)return false;		//若餘數為零，則為質數
		}
	return true;	//因為for迴圈跑完沒有餘數為零的，故為質數，所以回傳值0給主程式
	}
}
