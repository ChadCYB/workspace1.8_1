/*	Date: 2014/12/15
 * 	Uses: ¶O¦¡«Y¼Æ(»¼°j)
 *  Java JDK: 1.8
 */
package tt;
import java.util.Scanner;
public class ex02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("input:");
		int num = scn.nextInt();
		System.out.println(fuc(num));
	}
	public static int fuc(int num){
		if(num==1||num==2){
			return 1;
		}else{
			return (fuc(num-1)+fuc(num-2));
		}
	}
}