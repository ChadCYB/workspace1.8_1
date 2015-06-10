/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/17
 * 	Uses: switch判斷練習(4則運算)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class hw08_2_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0,b = 0,ans;
		String str = "Y",str1;
		while(str.equals("Y")||str.equals("y")){
			ans=0;
			System.out.print("請輸入第1個數:");
			a=scn.nextInt();
			System.out.print("請輸入第2個數:");
			b=scn.nextInt();
			System.out.print("您要的運算是(+ , - , * , /)?");
			str1 = scn.next();
			switch(str1){
			case "+":
				ans = a+b;
				break;
			case "-":
				ans = a-b;
				break;
			case "*":
				ans = a*b;
				break;
			case "/":
				ans = a/b;
				break;
			default:
				System.out.println("輸入錯誤");
			}
			System.out.println(a+str1+b+" = "+ans );
			System.out.print("是否繼續(Y/N)?");
			str=scn.next();
		}
	}
}
