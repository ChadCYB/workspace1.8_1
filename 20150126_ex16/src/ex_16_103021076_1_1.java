/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2015/01/19
 * 	Uses: ��X�ɮפ����X�Ӧr��(BufferedReader����)
 *  Java JDK: 1.6
 */
import java.io.*;
public class ex_16_103021076_1_1 {
	public static void main(String[] args) {
		String FileName = "TestFile.txt";
		try{
			String str;
			int v1=0, v2=0;
			FileReader fr = new FileReader(FileName);
			BufferedReader bfr = new BufferedReader(fr);
			while((str = bfr.readLine()) != null){
				char[] data = str.toCharArray();
				v1 += str.length()+1;
			}
			fr.close();		bfr.close();
			System.out.println("�����@��:"+(v1)+"�Ӧr��");
		}catch(IOException io){
			System.out.println("Ū�ɥX���D:"+io.toString());
		}
	}
}
