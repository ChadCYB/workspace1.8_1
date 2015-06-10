/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: 2維陣列練習
 * 	Java JDK: 1.8
 */
public class ex07_06_103021076 {
	public static void main(String[] args) {
		int[][] data = {{89,98,97,99,87},{97,89,98,99,87},{97,99,89,98,87}};
		String[] name = {"魯夫","喬巴","索隆"};
		String[] object = {"國文","英文","微積分","程式設計","資訊與生活"};
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]+"的各科成績如下:");
			for(int j=0;j<data[i].length;j++){
				System.out.println(object[j]+" => "+data[i][j]);
			}
			System.out.println();
		}
	}
}
