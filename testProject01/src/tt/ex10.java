package tt;

public class ex10 {
	public static void main(String[] args) {
		char setN[] = {'a','b','c','d'};
		getSubset(setN);
		//P("","abcd");
	}
	private static void getSubset(char set[]) {
		int length = set.length,i,k=1;
		for( i=1;i<(int)(1*Math.pow(2,length));i++){
			System.out.print((k++)+"\t[");
			for(int j=0;j<length;j++){
				if((i&(int)(1*Math.pow(2,j)))!=0){
					System.out.print(set[j]);
				}
			}
			System.out.print("]\n");
		}    
	}
	private static void P(String str1,String str2){
		char[] data = str2.toCharArray();
		int len = str2.length();
		//String [] datastr = new String [len];
		for(int i=0;i<len;i++){
			String str3 = str1+String.valueOf(data[i]);
			System.out.println(str3);
			String str4 = new StringBuffer(str2).deleteCharAt(i).toString();
			P(str3,str4);
		}
	}
}
