/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: �üƲ��Ͱ}�C5*7�A��X��m�}�C
 * 	Java JDK: 1.8
 */
import java.util.Random;
public class hw06_3_103021076 {
	public static void main(String[] args) {
		Random rand = new Random();
		int a[][] = new int[5][7];
		int i,j;
		System.out.println("�q�����ͤF5 X 7���üư}�C�p�U:");
		for(i=0 ; i<a.length ; i++){
			for(j=0 ; j<a[i].length ; j++){
				a[i][j]=rand.nextInt(10)+1;
				System.out.print((a[i][j]<10)?a[i][j]+"  ":a[i][j]+" ");		
			}
			System.out.println();
		}
		System.out.println("��m��7 X 5���üư}�C�p�U:");
		for(i=0 ; i<a[0].length ; i++){
			for(j=0 ; j<a.length ; j++){
				System.out.print((a[j][i]<10)?a[j][i]+"  ":a[j][i]+" ");		
			}
			System.out.println();
		}
	}

}

