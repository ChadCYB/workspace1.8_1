/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2015/01/19
 * 	Uses: 合併兩個檔案(FileInputStream版本)
 *  Java JDK: 1.6
 */
import java.io.*;
public class ex_16_103021076_2_2 {
	public static void main(String[] args) {
		String FileName1 = "TestFile.txt";
		String FileName2 = "TestFile2.txt";
		try{
			//第一個檔案
			FileInputStream fi1 = new FileInputStream(FileName1);
			int len1 = fi1.available();
			byte[] data1 = new byte[len1];
			fi1.read(data1);
			fi1.close();
			//第二個檔案
			FileInputStream fi2 = new FileInputStream(FileName1);
			int len2 = fi2.available();
			byte[] data2 = new byte[len1];
			fi1.read(data2);
			//合併檔案
			FileOutputStream fo = new FileOutputStream("out.txt");
			fo.write(data1);
			fo.write(data2);
			fo.close();
		}catch(IOException ioE){
			System.out.println("讀檔出問題:"+ioE.toString());
		}
	}
}
