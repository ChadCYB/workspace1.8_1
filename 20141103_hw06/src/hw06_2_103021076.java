/*	Author: 陳奕呈
 * 	Student ID: 103021076
 * 	Date: 2014/11/03
 * 	Uses: 輸出國字數字
 * 	Java JDK: 1.8
 */
import java.util.Random;
public class hw06_2_103021076 {
	public static void main(String[] args) {
		Random rand = new Random();
		int money = rand.nextInt(1000)+1;
		System.out.println("價格:"+money);
		char data[] = String.valueOf(money).toCharArray();
		if(money==1000){
			System.out.println(fuc(data[0])+"仟"+fuc(data[1])+"佰"+fuc(data[2])+"拾"+fuc(data[3])+"元");
		}else{
			System.out.println(fuc(data[0])+"佰"+fuc(data[1])+"拾"+fuc(data[2])+"元");
		}
	}
	public static String fuc(char c){
		String str="";
		int num = c - '0';	//char to int
		switch(num){
		case 0:
			str="零";
			break;
		case 1:
			str="壹";
			break;
		case 2:
			str="貳";
			break;
		case 3:
			str="參";
			break;
		case 4:
			str="肆";
			break;
		case 5:
			str="伍";
			break;
		case 6:
			str="陸";
			break;
		case 7:
			str="柒";
			break;
		case 8:
			str="捌";
			break;
		case 9:
			str="玖";
			break;
		}
		return str;
	}
}
