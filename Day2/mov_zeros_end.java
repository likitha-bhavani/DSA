//move all zeros to end of the array
import java.util.*;
public class mov_zeros_end {
    public static void main(String args[]){
        int a[]={1,2,0,3,1,0};
        int n=a.length;
        // int i=0,j=a.length-1;
        // while(i<j){
        //     if(a[i]!=0){
        //         i++;
        //     }
        //     if(a[j]==0){
        //         j--;
                
        //     }
        //     if(a[i]==0 && a[j]!=0){
        //         a[i]=a[j];
        //         a[j]=0;
        //         i++;
        //         j--;
        //     }
        // }
        // for(int k:a){
        //     System.out.print(k+" ");
        // }
        
int idx=0;
for(int i=0;i<n;i++){
    if(a[i]!=0){
        a[idx]=a[i];
        idx++;
    }
}
while(idx<n){
    a[idx]=0;
    idx++;
}
for(int k:a){
    System.out.print(k+" ");
}

    }
}
