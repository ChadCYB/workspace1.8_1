package tt;
import java.util.*;
import java.util.regex.Pattern;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
			 Scanner scn = new Scanner(System.in);
		      String s = "Hello World! 3+3.0=6";
		      // create a new scanner with the specified String Object
		      Scanner scanner = new Scanner(s);
		      // check if the scanner has a token
		      System.out.println("" + scanner.hasNext());
		      // print the rest of the string
		      System.out.println("" + scanner.nextLine());
		      // check if the scanner has a token after printing the line
		      System.out.println("" + scanner.hasNext());
		      // close the scanner
		      scanner.close();
		      while(scn.hasNext()){
		              System.out.println("loop start");
		              String s1 = scn.next();
		              System.out.println(s1);
		              if(s1.equals("exit")) {
		                  break;
		              }
		              System.out.println("loop end");
		      }
	}
}
