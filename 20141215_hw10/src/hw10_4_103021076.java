/*	Author: 朝
 * 	Student ID: 103021076
 * 	Date: 2014/12/15
 * 	Uses: 块0~9999块璣ゅ
 *  ex:
 *   52 -> fifty two
 *   1081 -> one thousand eighty one 
 *  Java JDK: 1.8
 */
import java.util.Scanner;

public class hw10_4_103021076 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		System.out.println(str1+" => "+conver(str1));
	}
	private static String conver(String str) {
		String outStr = "";
		int numLen = str.length();
		int inNum = Integer.parseInt(str), cal;
		if(inNum==0){							//计单0
			return "zero";
		}else if(inNum<=20){					//计单20
			return decToEng(inNum);
		}else{									//计20
			cal = inNum%100;						//玡ㄢ计
			if(cal<20){								//玡ㄢ计20
				outStr = decToEng(cal) + outStr;
				numLen -=2;
				for(int i=numLen; i>0; i--){		//ㄢ计矪瞶
					inNum = Integer.parseInt(str.substring(i-1,i));
					if(inNum!=0){	//狦计琌0玥ぃ块
						switch(numLen-i){
						case 0:		//κ计
							outStr = decToEng(inNum) +" "+ decToEng(100) +" "+ outStr;
							break;
						case 1:		//计
							outStr = decToEng(inNum) +" "+ decToEng(1000) +" "+ outStr;
							break;
						}
					}
				}
			}else{									//玡ㄢ计20
				for(int i=numLen; i>0; i--){		//计矪瞶
					inNum = Integer.parseInt(str.substring(i-1,i));
					if(inNum!=0){	//狦计琌0玥ぃ块
						switch(numLen-i){
						case 0:		//计
								outStr = decToEng(inNum) +" "+ outStr;
							break;
						case 1:		//计
								outStr = decToEng(inNum*10) +" "+ outStr;
							break;
						case 2:		//κ计
								outStr = decToEng(inNum) +" "+ decToEng(100) +" "+ outStr;
							break;
						case 3:		//计
								outStr = decToEng(inNum) +" "+ decToEng(1000) +" "+ outStr;
							break;
						}
					}
				}
			}
			return outStr;
		}
	}
	
	private static String decToEng(int num){
		String str="";
		switch((int)(num)){
//		case 0:
//			str = "zero";
//			break;
		case 1:
			str = "one";
			break;
		case 2:
			str = "two";
			break;
		case 3:
			str = "three";
			break;
		case 4:
			str = "four";
			break;
		case 5:
			str = "five";
			break;
		case 6:
			str = "six";
			break;
		case 7:
			str = "seven";
			break;
		case 8:
			str = "eight";
			break;
		case 9:
			str = "nine";
			break;
		case 10:
			str = "ten";
			break;
		case 11:
			str = "eleven";
			break;
		case 12:
			str = "twelve";
			break;
		case 13:
			str = "thirteen";
			break;
		case 14:
			str = "fourteen";
			break;
		case 15:
			str = "fiveteen";
			break;
		case 16:
			str = "sixteen";
			break;
		case 17:
			str = "seventeen";
			break;
		case 18:
			str = "eighteen";
			break;
		case 19:
			str = "nineteen";
			break;
		case 20:
			str = "twenty";
			break;
		case 30:
			str = "thirty";
			break;
		case 40:
			str = "forty";
			break;
		case 50:
			str = "fifty";
			break;
		case 60:
			str = "sixty";
			break;
		case 70:
			str = "seventy";
			break;
		case 80:
			str = "eighty";
			break;
		case 90:
			str = "ninety";
			break;
		case 100:
			str = "hundred";
			break;
		case 1000:
			str = "thousand";
			break;
		}
		return str;
	}
}
