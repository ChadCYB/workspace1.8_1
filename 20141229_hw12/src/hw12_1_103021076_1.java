/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/29
 * 	Uses: 萬年曆程式，使用者輸入年份及月份，輸出該月份日曆
 *  Java JDK: 1.8
 */
import java.util.Scanner;
import java.util.Calendar;
public class hw12_1_103021076_1{
	public static void main(String[] avg){
		Scanner scn = new Scanner(System.in);
		Calendar rightNow = Calendar.getInstance(); /* 產生 月曆元件 */
		int year,month;
		System.out.print("請輸入一年份(西元):");
		year = scn.nextInt();
		System.out.print("請輸入一月份:");
		month = scn.nextInt();
		rightNow.set(year, month-1, 1);		//year,month,date
		showCalendar(rightNow.get(Calendar.DAY_OF_WEEK)-1,getDay(rightNow));
	}
	private static void showCalendar(int startWeek, int day){	//顯示日曆
		String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int i=0;
		while(i<week.length)	System.out.print(week[i++]+"\t");
		System.out.println();
		i=1;
		while(i++<=startWeek%7)	System.out.print("\t");
		for(i=1;i<=day;i++){
			System.out.print(i+"\t");
			if(++startWeek%7 == 0)	System.out.println();
		}
	}
	private static int getDay(Calendar right){	//回傳那一年當月份有幾天
		if (right.MONTH == 11){					/* 計算一個月有幾天 */
			right.add(Calendar.YEAR, 1);
			right.set(Calendar.MONTH, 0);
		}else{
			right.add(Calendar.MONTH, 1);
		}
		right.add(Calendar.DATE, -1);
		return right.get(Calendar.DATE);
	}
}
