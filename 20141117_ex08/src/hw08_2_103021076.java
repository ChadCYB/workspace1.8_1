/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/17
 * 	Uses: switch�P�_�m��(4�h�B��)
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
			System.out.print("�п�J��1�Ӽ�:");
			a=scn.nextInt();
			System.out.print("�п�J��2�Ӽ�:");
			b=scn.nextInt();
			System.out.print("�z�n���B��O(+ , - , * , /)?");
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
				System.out.println("��J���~");
			}
			System.out.println(a+str1+b+" = "+ans );
			System.out.print("�O�_�~��(Y/N)?");
			str=scn.next();
		}
	}
}
