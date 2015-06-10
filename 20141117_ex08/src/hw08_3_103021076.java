/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/17
 * 	Uses: 陣列與For迴圈練習(產生亂數，找出眾數和算術平均數)
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
		System.out.print("\n眾數:");
		for(i=1;i<count.length;i++){
			if(count[i]==max){
				System.out.print(i+"\t");
			}
		}
		System.out.println("\n算術平均數:"+sum/num.length);
	}
}
