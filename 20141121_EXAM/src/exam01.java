/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/21
 * 	Uses: �p�� n*(n+1)
 * 	Java JDK: 1.8
 */
import java.util.Scanner;
public class exam01{
	public static void main(String[] args){
	   Scanner scn = new Scanner(System.in);
	   int n,i,ans=0,sum=0;
	   System.out.print("�п�Jn:");
	   n = scn.nextInt();
	   for(i=1;i<=n;i++){
		   ans=i*(i+1);
		   sum=sum+ans;
		   if(i==n){
			   System.out.print(ans+" ");
		   }else{
			   System.out.print(ans+"+");
		   }	   
	   }
	   System.out.print("= "+sum);
	}
}