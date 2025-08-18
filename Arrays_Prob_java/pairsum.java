import java.util.*;
public class pairsum {
    public static void main(String args[]){
        int[] arr = {2, 7, 11, 15, 3, 6};
        int target = 9;
        //burte force method-1 O(N^2)
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println(arr[i]+" "+arr[j]);
        //         }
        //     }
        // }
        HashSet<Integer> hs=new HashSet<>();//method-3
        for(int n:arr){
            int com=target-n;
            if(hs.contains(com)){
                System.out.println(n+" "+com);
            }
            hs.add(n);
        }
    }
}
//method-2 sorting+two pointer O(NlogN)
//method-3 Hash set O(N)
