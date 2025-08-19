//remove duplicate from an array
import java.util.*;
public class rem_dupli{
    public static void main(String args[]){
        int a[]={1,2,1,4,1};
        // LinkedHashSet<Integer> list=new LinkedHashSet<>();
        // for(int i:a){
        //     if(!list.contains(i)){
        //         list.add(i);
        //     }
        // }
        // for(int i: list){
        // System.out.print(i+" ");
        // }
Arrays.sort(a);
System.out.print(a[0]+" ");
for(int i=1;i<a.length;i++){
    if(a[i]!=a[i-1]){
        System.out.print(a[i]+" ");
    }
    
}

    }
}