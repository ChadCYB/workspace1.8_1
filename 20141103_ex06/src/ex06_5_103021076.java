/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: �üƲ��ͦ~���A�P�_���~�|�~
 * 	Java JDK: 1.8
 */
import java.util.Random;
public class ex06_5_103021076 {
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i=0;i<3;i++){
			int year=rand.nextInt(3000)+1;
			if(year%4==0&&year%100!=0||year%400==0){
				System.out.println(year+" is Leap year (�|�~)");
			}else{
				System.out.println(year+" is Average year (���~)");
			}
		}
	}
}
