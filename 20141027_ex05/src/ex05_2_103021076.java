/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/27
 * 	Uses: �έp���ơA�t�ơA�s�U���X��
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex05_2_103021076 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a=0,b=0,c=0,num;
		for(int i=0;i<6;i++){
			System.out.print("�п�J��"+(i+1)+"�ӼƦr:");
			num = scn.nextInt();
			if(num>0)a++;
			if(num<0)b++;
			if(num==0)c++;
		}
		System.out.println("����:"+a+"�� ; �t��:"+b+"�� ; �s:"+c+"��");
	}
}
