/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: 2���}�C�m��_2(while)
 * 	Java JDK: 1.8
 */
public class ex07_08_103021076 {
	public static void main(String[] args) {
		int i,j;
		int[][] data = {{89,98,97,99,87},{97,89,98,99,87},{97,99,89,98,87}};
		String[] name = {"�|��","���","����"};
		String[] object = {"���","�^��","�L�n��","�{���]�p","��T�P�ͬ�"};
		System.out.print("\t");
		i = 0;
		while(i<object.length){
			System.out.print(object[i]+"\t");
			i++;
		}
		System.out.println();
		i = 0;
		while(i<name.length){
			System.out.print(name[i]+"\t");
			j = 0;
			while(j<data[i].length){
				System.out.print(data[i][j]+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
