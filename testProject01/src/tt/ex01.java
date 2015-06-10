/*	Date: 2014/12/15
 * 	Uses: 投擲兩個骰子機率
 *  Java JDK: 1.8
 */
package tt;
public class ex01 {
	public static void main(String[] args) {
		int[][] sol = new int[7][7];
		int i,j,k;
		for(k=0;k<36000;k++){
			i = (int)(Math.random()*6)+1;
			j = (int)(Math.random()*6)+1;
			sol[i][j]++;
		}
		for(i=0;i<sol.length;i++){
			System.out.print(i+"\t");
		}
		System.out.println();
		for(i=1;i<sol.length;i++){
			for(j=1;j<sol[i].length;j++){
				if(j==1)System.out.print(i+"\t");
				System.out.print(sol[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
