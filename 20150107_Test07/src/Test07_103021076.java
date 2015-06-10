import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test07_103021076 {
	public static void main(String[] args) {
		int[] data = null;
		try {
			data = txtRead();
		} catch (IOException e) {
			e.printStackTrace();
		}
		float[] score = new float[data.length];
		int min,max,i;
		min = data[0];
		max = data[data.length-1];
		System.out.println("\n最高分:"+max+"\t最低分:"+min);
		System.out.println("轉換後:");
		for(i=0;i<data.length-1;i++){
			score[i] = (float)(data[i]-min)/(max-min)*100;
			System.out.print(score[i]+",");
		}
	}
	
	public static int[] txtRead() throws IOException {
		ArrayList arr = new ArrayList();
		int data[] = null;
		try {
			File file = new File("src/MathS_Score.txt");
			java.util.Scanner scn = new java.util.Scanner(file);
			while(scn.hasNext()) arr.add(scn.next());	//存入陣列
			scn.close();
			data = new int[arr.size()];
			for(int i =0;i<arr.size();i++){
				data[i] = Integer.parseInt((String)arr.get(i));		//ArrayList to Array
			}
			System.out.println("未排序: ");
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + ",");
			}
			Arrays.sort(data);				//排序函數
			System.out.println("\n排序: ");
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + ",");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return data;
	}
}
