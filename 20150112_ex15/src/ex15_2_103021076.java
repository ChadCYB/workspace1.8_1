/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2015/01/12
 * 	Uses: 產生n個0~m的亂數之平均值
 *  Java JDK: 1.6
 */
public class ex15_2_103021076 {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("產生n個0~m的亂數");
		System.out.print("請輸入n:");
		int n = scn.nextInt();
		System.out.print("請輸入m:");
		int m = scn.nextInt();
		System.out.println("\n平均值"+myrand(n,m));
	}
	public static double myrand(int n, int m){
		int sum=0,rand,i;
		for(i=0;i<n;i++){
			rand = (int)(Math.random()*m);	//亂數產生
			sum += rand;					//亂數加總
			System.out.print(rand+"\t");
		}
		double avg = sum/(n+0.0);			//計算平均
		return avg;							//回傳平均值
	}
}
