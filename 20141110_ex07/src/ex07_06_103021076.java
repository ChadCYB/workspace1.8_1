/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: 2���}�C�m��
 * 	Java JDK: 1.8
 */
public class ex07_06_103021076 {
	public static void main(String[] args) {
		int[][] data = {{89,98,97,99,87},{97,89,98,99,87},{97,99,89,98,87}};
		String[] name = {"�|��","���","����"};
		String[] object = {"���","�^��","�L�n��","�{���]�p","��T�P�ͬ�"};
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]+"���U�즨�Z�p�U:");
			for(int j=0;j<data[i].length;j++){
				System.out.println(object[j]+" => "+data[i][j]);
			}
			System.out.println();
		}
	}
}
