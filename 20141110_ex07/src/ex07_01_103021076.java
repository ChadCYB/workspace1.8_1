/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: 1��100(��Ƭۥ[),1��100(���Ƭۥ[),�s�[A��B
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex07_01_103021076 {
	public static void main(String[] args) {
		int start=1,end=100,sum=0,i;
		for(i=start;i<=end;i++){
			sum+=(i%2==0)?0:i;
		}
		System.out.println(start+"�[��"+end+"(��Ƭۥ[) = "+sum);
		sum=0;
		System.out.println("=================================");
		
		for(i=start;i<=end;i++){
			sum+=(i%2==0)?i:0;
		}
		System.out.println(start+"�[��"+end+"(���Ƭۥ[) = "+sum);
		System.out.println("=================================");
		
		Scanner scn = new Scanner(System.in);
		sum=0;
		System.out.print("�п�J�_�l��:");
		start = scn.nextInt();
		System.out.print("�п�J������:");
		end = scn.nextInt();
		for(i=start;i<=end;i++){
			sum+=i;
		}
		System.out.println(start+"�[��"+end+" = "+sum);
	}
}
