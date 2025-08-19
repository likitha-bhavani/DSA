//Merge two sorted arrays
import java.util.*;
public class mer_arr{
    public static void main(String args[]){
int a[]={10,20,30};
int b[]={11,24,56};
// int n=a.length;
// int m=b.length;
// int c[]=new int[m+n];
// int i=0,j=0,k=0;
// while(i<n && j<m){
//     if(a[i]<b[j]){
//         c[k++]=a[i++];
//     }
//     else{
//         c[k++]=b[j++];
//     }
// }
// while(i<n){
//     c[k++]=a[i++];
// }
// while(j<m){
//     c[k++]=b[j++];
// }

// for(int num:c){
//     System.out.print(num+" ");
// }


ArrayList<Integer> list=new ArrayList<>();
for(int i:a){
    list.add(i);
}
for(int j:b){
    list.add(j);
}
Collections.sort(list);
for(int i:list){
    System.out.print(i + " ");
}

    }
}