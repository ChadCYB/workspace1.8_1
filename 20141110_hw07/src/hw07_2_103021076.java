/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: �ֳz�üƿ︹�{��
 * 	Java JDK: 1.8
 */
public class hw07_2_103021076 {
	public static void main(String[] arg){
		boolean[] num = new boolean[43];
		int rand,i;
		for(i=0;i<6;i++){
			do{
				rand = (int)(Math.random()*42)+1;
			}while(num[rand]);
			num[rand]=true;
			System.out.print(rand+" ");
		}
	}
}