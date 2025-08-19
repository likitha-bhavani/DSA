//Reverse an array
import java.util.*;
public class rev_arr{
    public static void  main(String args[]){
        int a[]={2,312,4,2,45};
       
// Integer a[]={2,312,4,23};
// Collections.reverse(Arrays.asList(a));
// for(int i :a){
//     System.out.print(i+" ");
// }



// for(int i=a.length-1;i>=0;i--){
//     System.out.print(a[i]+" ");

// }


int n=a.length;
for(int i=0;i<n/2;i++){
    int temp=a[i];
    a[i]=a[n-i-1];
    a[n-i-1]=temp;

}
for(int i:a){
    System.out.print(i+" ");
}


    }
}