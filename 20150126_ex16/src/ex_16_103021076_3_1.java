/*	Author: 朝
 * 	Student ID: 103021076
 * 	Date: 2015/01/19
 * 	Uses: т郎ずΤ碭フ璣ゅ计传︽(BufferedReaderセ)
 *  Java JDK: 1.6
 */
import java.io.*;
public class ex_16_103021076_3_1 {
	public static void main(String[] args) {
		String FileName = "TestFile.txt";
		try{
			String str;
			int v1=0, v2=0, v3=0, v4=0;
			FileReader fr = new FileReader(FileName);
			BufferedReader bfr = new BufferedReader(fr);
			while((str = bfr.readLine()) != null){
				char[] data = str.toCharArray();
				for(int i=0 ; i<str.length() ;i++){
					if(data[i] == ' ') v1++;					//フ
					if((data[i]>=65 && data[i]<=90)||
						(data[i]>=97 && data[i]<=122)) v2++;	//璣ゅ
					if(data[i]>=48 && data[i]<=57) v3++;		//计
				}
				v4++;
			}
			fr.close();		bfr.close();
			System.out.println("フ:"+v1+"\n璣ゅ:"+v2+"\n计:"+v3+"\n传︽:"+(v4));
		}catch(IOException io){
			System.out.println("弄郎拜肈:"+io.toString());
		}
	}
}
