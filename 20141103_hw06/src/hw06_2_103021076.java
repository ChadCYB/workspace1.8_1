/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: ��X��r�Ʀr
 * 	Java JDK: 1.8
 */
import java.util.Random;
public class hw06_2_103021076 {
	public static void main(String[] args) {
		Random rand = new Random();
		int money = rand.nextInt(1000)+1;
		System.out.println("����:"+money);
		char data[] = String.valueOf(money).toCharArray();
		if(money==1000){
			System.out.println(fuc(data[0])+"�a"+fuc(data[1])+"��"+fuc(data[2])+"�B"+fuc(data[3])+"��");
		}else{
			System.out.println(fuc(data[0])+"��"+fuc(data[1])+"�B"+fuc(data[2])+"��");
		}
	}
	public static String fuc(char c){
		String str="";
		int num = c - '0';	//char to int
		switch(num){
		case 0:
			str="�s";
			break;
		case 1:
			str="��";
			break;
		case 2:
			str="�L";
			break;
		case 3:
			str="��";
			break;
		case 4:
			str="�v";
			break;
		case 5:
			str="��";
			break;
		case 6:
			str="��";
			break;
		case 7:
			str="�m";
			break;
		case 8:
			str="��";
			break;
		case 9:
			str="�h";
			break;
		}
		return str;
	}
}
