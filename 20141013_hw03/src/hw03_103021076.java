/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: �̪񪺤@���|�~
 */
import java.util.Scanner;
public class hw03_103021076 {
	public static void main(String[] args) {
		int remainder,year,y1,y2;
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�~��:");
		year = scn.nextInt();	
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+" is Leap year (�|�~)");
		}else{
			System.out.println(year+" is Average year (���~)");
			remainder = (year%4);
			y1 = year-remainder;
			y2 = y1+4;
			if(!(y1%4==0&&y1%100!=0||y1%400==0))y1 = y1-4;
			if(!(y2%4==0&&y2%100!=0||y2%400==0))y2 = y2+4;
			if(Math.abs(year-y1)==Math.abs(year-y2)){
				System.out.println("��"+year+"�̪񪺤@���|�~�O:"+y1+"�H��"+y2);			
			}else if(Math.abs(year-y1)<Math.abs(year-y2)){
				System.out.println("��"+year+"�̪񪺤@���|�~�O:"+y1);
			}else{
				System.out.println("��"+year+"�̪񪺤@���|�~�O:"+y2);
			}
		}
	}
}
