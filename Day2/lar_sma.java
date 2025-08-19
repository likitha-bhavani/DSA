//Find largest and smallest element in array
import java.util.*;
public class lar_sma{
    public static void main(String args[]){
         int a[]={1,12,3,43,90};
        // Arrays.sort(a);
        // System.out.println("largest :"+ a[a.length-1]);
        // System.out.println("Smallest :"+a[0]);


        // int max=a[0],mi=a[0];
        // for(int i=1;i<a.length;i++){
        //     max=Math.max(max,a[i]);
        //     mi=Math.min(mi,a[i]);
           
        // }
        // System.out.println(max);
        // System.out.println(mi);

        int max=a[0],mi=a[0];
        for(int i=1;i<a.length;i++){
           if(a[i]>max){
            max=a[i];
           }
           if(a[i]<mi){
            mi=a[i];
           }
        }
             System.out.println(max);
        System.out.println(mi);
           
        



    }
}
