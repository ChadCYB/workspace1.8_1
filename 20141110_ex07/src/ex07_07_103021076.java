/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: 2維陣列練習_2
 * 	Java JDK: 1.8
 */
public class ex07_07_103021076 {
	public static void main(String[] args) {
		int i,j;
		int[][] data = {{89,98,97,99,87},{97,89,98,99,87},{97,99,89,98,87}};
		String[] name = {"魯夫","喬巴","索隆"};
		String[] object = {"國文","英文","微積分","程式設計","資訊與生活"};
		System.out.print("\t");
		for(i=0;i<object.length;i++){
			System.out.print(object[i]+"\t");
		}
		System.out.println();
		for(i=0;i<name.length;i++){
			System.out.print(name[i]+"\t");
			for(j=0;j<data[i].length;j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
