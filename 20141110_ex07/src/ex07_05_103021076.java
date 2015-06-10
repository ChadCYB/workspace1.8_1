/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: 輸出AXB乘法表(while)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex07_05_103021076 {
	public static void main(String[] args) {
		int V1,V2,i,j;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入起始值:");
		V1 = scn.nextInt();
		System.out.print("請輸入結束值:");
		V2 = scn.nextInt();
		i = 1;
		while(i <= V1){
			if(i==1){
				System.out.print("\t"+"|"+i);	
			}else{
				System.out.print("\t"+i);
			}
			i++;
		}
		System.out.print("\n");
		i = 1;
		while(i <= V1){
			System.out.print("=========");
			i++;
		}
		System.out.print("\n");
		i = 1;
		while(i <= V2){
			System.out.print(i+"\t");
			j = 1;
			while(j<=V1){
				if(j==1){
					System.out.print("|"+i*j+"\t");					
				}else{
				System.out.print(i*j+"\t");						
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
