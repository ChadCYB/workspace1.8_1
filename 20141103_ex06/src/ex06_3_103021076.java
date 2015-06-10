/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 亂數產生，判斷Max,Min
 * 	Java JDK: 1.8
 */
import java.util.Random;
public class ex06_3_103021076 {
	public static void main(String[] args) { 
		Random rand = new Random();
		int a[] = new int[3];
		int i,maxNum=0, minNum=255;
		for(i=0 ; i<a.length ; i++){
			a[i]=rand.nextInt(100)+1;
			System.out.print(a[i]+"\t");	
			maxNum=(maxNum<a[i])?a[i]:maxNum;
			minNum=(minNum>a[i])?a[i]:minNum;
		}
		System.out.println("\nMax:"+maxNum+"\tMin:"+minNum);
	}
}