/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2015/01/19
 * 	Uses: ��X�ɮפ����X�Ӧr��(FileInputStream����)
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
			System.out.println("�����@��:"+(len)+"�Ӧr��");
		}catch(IOException io){
			System.out.println("Ū�ɥX���D:"+io.toString());
		}
	}
}
