package tt;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入身分證字號");
		int sum, i=9, j=1;
		String inStr = scn.next();
		inStr = convert(inStr.charAt(0)+"") + inStr.substring(1);
		char a[] = inStr.toCharArray();
		sum = (a[0]-'0')+(a[10]-'0');			//第一個加最後一個
		//System.out.println(sum+"\t"+inStr);
		while(i>0)	sum += ((a[i--]-'0')*j++);	//計算總和
		//System.out.println(sum);
		System.out.println((sum%10 == 0)?"正確":"錯誤");
	}
	private static int convert(String str){
		int val = 0;
		switch(str){
		case "A":
			val = 10;
			break;
		case "B":
			val = 11;
			break;
		case "C":
			val = 12;
			break;
		case "D":
			val = 13;
			break;
		case "E":
			val = 14;
			break;
		case "F":
			val = 15;
			break;
		case "G":
			val = 16;
			break;
		case "H":
			val = 17;
			break;
		case "J":
			val = 18;
			break;
		case "K":
			val = 19;
			break;
		case "L":
			val = 20;
			break;
		case "M":
			val = 21;
			break;
		case "N":
			val = 22;
			break;
		case "P":
			val = 23;
			break;
		case "Q":
			val = 24;
			break;
		case "R":
			val = 25;
			break;
		case "S":
			val = 26;
			break;
		case "T":
			val = 27;
			break;
		case "U":
			val = 28;
			break;
		case "V":
			val = 29;
			break;
		case "X":
			val = 30;
			break;
		case "Y":
			val = 31;
			break;
		case "W":
			val = 32;
			break;
		case "Z":
			val = 33;
			break;
		case "I":
			val = 34;
			break;
		case "O":
			val = 35;
			break;
		}
		return val;
	}
}