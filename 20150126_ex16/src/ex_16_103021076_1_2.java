/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2015/01/19
 * 	Uses: 找出檔案內有幾個字元(FileInputStream版本)
 *  Java JDK: 1.6
 */
import java.io.*;
public class ex_16_103021076_1_2 {
	public static void main(String[] args) {
		String FileName = "TestFile.txt";
		try{
			FileInputStream fi = new FileInputStream(FileName);
			int len = fi.available();
			fi.close();
			System.out.println("全部共有:"+(len)+"個字元");
		}catch(IOException io){
			System.out.println("讀檔出問題:"+io.toString());
		}
	}
}
