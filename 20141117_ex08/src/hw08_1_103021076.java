/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/17
 * 	Uses: while迴圈,switch判斷練習(輸入成績判斷)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw08_1_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0;
		String str = "Y",str1;
		while(str.equals("Y")||str.equals("y")){//while迴圈判斷是否重複做
			System.out.print("請輸入分數:");
			a=scn.nextInt();		//成績資料輸入
			switch(a/10){			//a/10用10位數做判斷
			case 10:				//100分
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
			default:				//剩下的(60以下)
				str1 = "E";
			}
			System.out.println("你的成績是:"+str1);
			System.out.print("是否繼續(Y/N)?");
			str=scn.next();			//是否重複
		}
		System.out.print("Bye Bye~");
	}
}
