/*	Author: �����e
 * 	Student ID: 103021076
 * 	Date: 2014/11/10
 * 	Uses: ��X9X9���k��
 * 	Java JDK: 1.8
 */
public class ex07_03_103021076 {
	public static void main(String[] args) {
		int V1=9,V2=9,i,j;
		for(i = 1;i <= V1;i++){
			if(i==1){
				System.out.print("\t"+"|"+i);	
			}else{
				System.out.print("\t"+i);
			}
		}
		System.out.print("\n");
		for(i = 1;i <= V1;i++){
			System.out.print("=========");
		}
		System.out.print("\n");
		for(i=1;i<=V1;i++){
			System.out.print(i+"\t");
			for(j=1;j<=V2;j++){	
				if(j==1){
					System.out.print("|"+i*j+"\t");					
				}else{
				System.out.print(i*j+"\t");						
				}
			}
			System.out.println();
		}
	}
}
