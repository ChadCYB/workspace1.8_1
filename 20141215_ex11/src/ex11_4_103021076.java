/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: ISBN檢查程式
 *  書碼次序   1 2 3 4 5 6 7 8 9 10
 *  乘上倍數10 9 8 7 6 5 4 3 2 1
 *  加總後被"11"整除為正確ISBN
 *  Java JDK: 1.6
 */
import java.util.Scanner;

public class ex11_4_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入ISBN:");
		String str = scn.next();
		System.out.println(str + (judge(str)?"為正確編號":"不是正確編號"));
	}
	
	private static boolean judge(String input){
		input = input.replaceAll("-", "");
		//System.out.println(input);
		int strLen = input.length(), sum=0, i, j=10, num;
		for(i=0;i<strLen;i++){
			num = Integer.parseInt(input.substring(i, i+1));	//字串轉換Int
			sum += num*j;										//加總
			j--;
		}
		if(sum%11==0){	//ISBN 判斷
			return true;
		}else{
			return false;
		}
	}
}
