/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/17
 * 	Uses: �}�C�PFor�j��m��(���ͶüơA��X���ƩM��N������)
 * 	Java JDK: 1.8
 */
public class hw08_3_103021076 {
	public static void main(String[] args) {
		int[] num = new int[12];
		int[] count = new int[11];
		int i ,man ,sum=0 ,max=0;
		for(i=0;i<num.length;i++){
			num[i] = (int)(Math.random()*10)+1;
			count[num[i]]++;
			System.out.print(num[i]+"  ");
			sum = sum + num[i];
		}
		for(i=1;i<count.length;i++){
			max=(max<count[i])?count[i]:max;
		}
		System.out.print("\n����:");
		for(i=1;i<count.length;i++){
			if(count[i]==max){
				System.out.print(i+"\t");
			}
		}
		System.out.println("\n��N������:"+sum/num.length);
	}
}
