import java.util.*;

public class Test20140819 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rand = new Random();
		boolean num[] = new boolean[43];
		int v1;
		while(true){
			for(int i=1;i<=42;i++){
				num[i]=false;
			}
			for(int i=1;i<=6;i++){
				v1=rand.nextInt(42)+1;
				if(num[v1]){
					i--;
				}else{
					num[v1]=true;
					System.out.print(v1+"\t");
				}
			}
			System.out.print("¬O§_Ä~Äò(y/n)?");
			String str = scn.next();
			if(str.equals("N")||str.equals("n")){
				System.out.println("Bye Bye~");
				break;
			}
		}
	}
}
