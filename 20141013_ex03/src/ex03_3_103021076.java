/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/10/13
 * 	Uses: �з��魫�p��
 */
import java.util.Scanner;
public class ex03_3_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float ans=0;
		System.out.print("�п�ܩʧO(1)�k(2)�k: ");
		int type = scn.nextInt();
		System.out.print("�п�J����: ");
		float high = scn.nextFloat();
		if (type==1){
			ans = (float) ((high-170)*0.6+62);
		}else{
			ans = (float) ((high-158)*0.5+52);
		}
		System.out.println("����: "+high+"\t�з��魫: "+ans);
	}
}
