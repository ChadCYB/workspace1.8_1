/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/17
 * 	Uses: �}�C�PFor�j��m��(���ͶüơA��w�Ƨǻ����X�A�ç䤤���)
 * 	Java JDK: 1.8
 */
public class hw08_4_103021076 {
	public static void main(String[] args) {
		int[] num = new int[9];
		int i ,j ,temp;
		for(i=0;i<num.length;i++){
			num[i] = (int)(Math.random()*20)+1;
			System.out.print(num[i]+"\t");
		}
		for(i=0;i<num.length;i++){
			for(j=i;j<num.length;j++){
				if(num[i]<num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("\n�Ƨǫ�:");
		for(i=0;i<num.length;i++){
			System.out.print(num[i]+"\t");
		}
		System.out.println("\n�����:"+num[(num.length-1)/2]);
	}
}
