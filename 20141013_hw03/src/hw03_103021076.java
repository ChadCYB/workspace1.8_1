/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: 最近的一次閏年
 */
import java.util.Scanner;
public class hw03_103021076 {
	public static void main(String[] args) {
		int remainder,year,y1,y2;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入年份:");
		year = scn.nextInt();	
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+" is Leap year (閏年)");
		}else{
			System.out.println(year+" is Average year (平年)");
			remainder = (year%4);
			y1 = year-remainder;
			y2 = y1+4;
			if(!(y1%4==0&&y1%100!=0||y1%400==0))y1 = y1-4;
			if(!(y2%4==0&&y2%100!=0||y2%400==0))y2 = y2+4;
			if(Math.abs(year-y1)==Math.abs(year-y2)){
				System.out.println("離"+year+"最近的一次閏年是:"+y1+"以及"+y2);			
			}else if(Math.abs(year-y1)<Math.abs(year-y2)){
				System.out.println("離"+year+"最近的一次閏年是:"+y1);
			}else{
				System.out.println("離"+year+"最近的一次閏年是:"+y2);
			}
		}
	}
}
