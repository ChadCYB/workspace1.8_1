/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: ��XAXB���k��
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex07_04_103021076 {
	public static void main(String[] args) {
		int V1,V2,i,j;
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�_�l��:");
		V1 = scn.nextInt();
		System.out.print("�п�J������:");
		V2 = scn.nextInt();
		for(i = 1;i <= V1;i++){
			if(i==1){
				System.out.print("\t"+"|"+i);	
			}else{
				System.out.print("\t"+i);
			}
		}
		System.out.print("\n");
		for(i = 1;i<=V1;i++){
			System.out.print("=========");
		}
		System.out.print("\n");
		for(i=1;i<=V2;i++){
			System.out.print(i+"\t");
			for(j=1;j<=V1;j++){	
				if(j==1){
					System.out.print("|"+i*j+"\t");					
				}else{
				System.out.print(i*j+"\t");						
				}
			}
			System.out.println();
		}
	}
}
