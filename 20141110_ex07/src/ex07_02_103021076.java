/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: [1��100(��Ƭۥ[),1��100(���Ƭۥ[),�s�[A��B]>>>(�������While)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex07_02_103021076 {
	public static void main(String[] args) {
		int start=1, end=100, sum=0, i;
		i = start;
		while(i<=end){
			sum+=(i%2==0)?i:0;
			i++;
		}
		System.out.println(start+"�[��"+end+"(���Ƭۥ[) = "+sum);
		System.out.println("=================================");
		
		sum=0;
		i = start;
		while(i<=end){
			sum+=(i%2==0)?0:i;
			i++;
		}
		System.out.println(start+"�[��"+end+"(��Ƭۥ[) = "+sum);
		System.out.println("=================================");
		
		Scanner scn = new Scanner(System.in);
		sum=0;
		System.out.print("�п�J�_�l��:");
		start = scn.nextInt();
		System.out.print("�п�J������:");
		end = scn.nextInt();
		i=start;
		while(i<=end){
			sum+=i;
			i++;
		}
		System.out.println(start+"�[��"+end+" = "+sum);
	}
}