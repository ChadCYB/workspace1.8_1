/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/12/22
 * 	Uses: 尋找f,g陣列相同的元素
 *  Java JDK: 1.8
 */
public class ex11_5_10321076 {
	public static void main(String[] args) {
		int[] f = {1,3,4,7,9};
		int[] g = {3,5,7,8,10};
		int i,j,count=1;
		System.out.println("f陣列:");
		showAry(f);
		System.out.println("g陣列:");
		showAry(g);
		for(i=0;i<f.length;i++){
			for(j=0;j<g.length;j++){
				if(f[i]==g[j]){
					System.out.println("第"+count+"組\tf["+i+"] , g["+j+"]均為 "+f[i]);
					count++;
				}
			}
		}
	}
	private static void showAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+((i==arr.length-1)?"\n":"\t"));
		}
	}
}
