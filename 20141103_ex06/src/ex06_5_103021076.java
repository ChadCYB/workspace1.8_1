/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 亂數產生年份，判斷平年閏年
 * 	Java JDK: 1.8
 */
import java.util.Random;
public class ex06_5_103021076 {
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i=0;i<3;i++){
			int year=rand.nextInt(3000)+1;
			if(year%4==0&&year%100!=0||year%400==0){
				System.out.println(year+" is Leap year (閏年)");
			}else{
				System.out.println(year+" is Average year (平年)");
			}
		}
	}
}
