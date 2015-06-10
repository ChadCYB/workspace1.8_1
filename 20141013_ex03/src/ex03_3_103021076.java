/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: 標準體重計算
 */
import java.util.Scanner;
public class ex03_3_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float ans=0;
		System.out.print("請選擇性別(1)男(2)女: ");
		int type = scn.nextInt();
		System.out.print("請輸入身高: ");
		float high = scn.nextFloat();
		if (type==1){
			ans = (float) ((high-170)*0.6+62);
		}else{
			ans = (float) ((high-158)*0.5+52);
		}
		System.out.println("身高: "+high+"\t標準體重: "+ans);
	}
}
