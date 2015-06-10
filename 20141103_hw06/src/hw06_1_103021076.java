/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 千元付款，找零
 * 	Java JDK: 1.8
 */
import java.util.Random;
public class hw06_1_103021076 {
	public static void main(String[] args) {
		Random rand = new Random();
		int money = rand.nextInt(1000)+1;
		int m1,m2,m3,m4;
		m1=money%500;
		m2=m1%100;
		m3=m2%50;
		m4=m3%10;
		System.out.println("價格:"+money);
		System.out.println("找錢:\n500:"+(money/500)+"張\t100:"+(m1/100)+"張\t50:"+(m2/50)+"張");
		System.out.println("10 :"+(m3/10)+"個\t1  :"+m4+"個");
	}
}
