/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/12/01
 * 	Uses: ��ƽm��(��X�@�ӹ�ߥ��諬)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class ex09_3_103021076{
	public static void main(String [] argv){
    	Scanner scn = new Scanner(System.in);
    	System.out.print("�п�J���:");
    	int n = scn.nextInt();
    	System.out.print("�п�J�r��:");
    	char c = scn.next().charAt(0);
    	square(n,c);
	}
	private static void square(int n,char c){
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
