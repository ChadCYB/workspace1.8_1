package tt;
import java.util.Scanner;
public class ex05 {
	static int sum=0;
	public static void main(String[] avg) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(rsum(num));
	}
	
	private static int rsum(int n){
		sum += (n-1)*n;
		if(n<=2){
			return sum;
		}else{
			n--;
			return rsum(n);
		}
	}
}
