//Find pair of elements with given sum

import java.util.*;

public class pair_el{
    public static void main(String args[]){
        int a[]={2,3,11,5,16,7};
        int target=9;
        // HashSet<Integer> set=new HashSet<>();
        // for(int i :a){
        //     int k=target-i;
        //     if(set.contains(k)){
        //         System.out.print(k+" "+ i);
        //     }
        //     set.add(i);
        // }


        //  Arrays.sort(a);   
        // int i = 0, j = a.length - 1;

        // while (i < j) {  
        //     int sum = a[i] + a[j];

        //     if (sum == target) {
        //         System.out.println(a[i] + " " + a[j]);  
        //         i++;  
        //         j--;  
        //     } else if (sum > target) {
        //         j--;  
        //     } else {
        //         i++;  
        //     }
        // }


        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.print(a[i]+" "+a[j]);

                }
            }
        }




    }
}