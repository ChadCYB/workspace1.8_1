/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/21
 * 	Uses: 陣列的迴文判斷
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class exam02{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int[] data ={1,2,3,3,2,1};
		int i,j,count=0;
		for(i=0;i<data.length;i++){
			System.out.print(data[i]+",");
		}
		for(i=0,j=data.length-1;i<data.length;i++,j--){
			if(data[i]==data[j]){
				count++;
			}
		}
		if(count==data.length){
			System.out.println("迴文");
		}else{
			System.out.println("不是迴文");
		}
	}
}