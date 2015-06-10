package tt;

public class ex07 {
    public static void main(String[] avg) {
    	int[] num = {5,6,7,8,5,1,2,5,6,8,4,2,3,0,-3};
        sort(num, 0, num.length-1);
        showAry(num);
    }
    
    private static void sort(int[] number, int left, int right) {
        if(left < right) { 
            int s = number[(left+right)/2]; 
            int i = left - 1; 
            int j = right + 1; 

            while(true) { 
                // 向右找
                while(number[++i] < s) ;
                // 向左找
                while(number[--j] > s) ; 
                if(i >= j) 
                    break; 
                swap(number, i, j); 
            } 

            sort(number, left, i-1);   // 對左邊進行遞迴 
            sort(number, j+1, right);  // 對右邊進行遞迴 
        }
    }
    
    private static void swap(int[] number, int i, int j) {
        int t = number[i]; 
        number[i] = number[j]; 
        number[j] = t;
    }
	private static void rndAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*10)-5;
		}
	}
	private static void showAry(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+((i==arr.length-1)?"\n":"\t"));
		}
	}
}