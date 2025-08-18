public class zeros_end {
    public static void main(String[] args) {
        // int []arr = {0, 1, 0, 3, 12};
        int []arr = {0, 0, 0, 5, 0, 7, 0, 0, 9, 0};
        int i=0,j=arr.length-1;
        while(i<j){//O(N)
            if(arr[i]!=0){
                i++;
            }
            if(arr[j]==0){
                j--;
            }
            if(arr[i]==0&&arr[j]!=0){
                arr[i]=arr[j];
                arr[j]=0;
                i++;
                j--;
            }
        }
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
/* method-2 O(N) moving non-zero to forword and filling remaining with zeros 
method1 and 2 output are different
 public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        
        int pos = 0; // position for next non-zero
        
        // Step 1: Move all non-zeros forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
        
        // Step 2: Fill remaining with zeros
        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
        
        // Print result
        for (int n : arr) {
            System.out.print(n + " ");o/p=1,3,12,0,0
        }
    }
}

 */
