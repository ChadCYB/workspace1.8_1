/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2015/01/19
 * 	Uses: 合併兩個檔案(BufferedReader版本)
 *  Java JDK: 1.6
 */
import java.io.*;
public class ex_16_103021076_2_1 {
	public static void main(String[] args) {
		String FileName1 = "TestFile.txt";
		String FileName2 = "TestFile2.txt";
		try{
			int data;
			FileReader fr1 = new FileReader(FileName1);
			FileReader fr2 = new FileReader(FileName2);
			BufferedReader bfr1 = new BufferedReader(fr1);
			BufferedReader bfr2 = new BufferedReader(fr2);
			String Merger = "";
			while((data = fr1.read()) != -1){
				Merger += (char)data+"";
			}
			while((data = fr2.read()) != -1){
				Merger += (char)data+"";
			}
			fr1.close(); fr2.close();	//關閉FileReader
			bfr1.close(); bfr2.close();	//關閉BufferedReader
			FileWriter fw = new FileWriter("out.txt");
			fw.write(Merger);	//字串寫入檔案
			fw.close();			//關閉FileWriter，馬上寫入硬碟
			System.out.println("合併:\n"+Merger);
		}catch(IOException ioE){
			System.out.println("讀檔出問題:"+ioE.toString());
		}
	}
}
