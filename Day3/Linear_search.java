import java.util.*;
public class Linear_search {
    // public static void main(String args[]){
    //     int a[]={36,23,54,46,11,52,32};
    //     int target=36,k=-1;
    //     k=linearSearch(a,target,0);
    //      if(k!=-1){
    //         System.out.print("the element is "+ target + " pos at "+k);
    //     }
    //     else{
    //         System.out.print("not found");
    //     }

       
    // }
    // public static int linearSearch(int a[],int target){
    //     int k=-1;
    //     for(int i=0;i<a.length;i++){
    //         if(a[i]==target){
    //             return k;
              
    //         }
    //          }
    //     return -1;

    // }

    //for each
    // public static int linearSearch(int a[],int target){
    //     int idx=0;
    //     for(int i:a){
    //         if(i==target){
    //             return idx;
    //         }
    //         idx++;
    //     }
    //     return -1;
    // }

//recurrsion
// public static int linearSearch(int a[],int target,int idx){
    
//     if(idx>=a.length){
//         return -1;
//     }
//     if(a[idx]==target){
//         return idx;
//     }
//     return linearSearch(a, target, idx+1);
// }


   public static void main(String args[]){
    Integer a[]={23,45,32,29,39};
    int target=45;
    List<Integer> list=Arrays.asList(a);
    int idx=list.indexOf(target);
    if(idx!=-1){
        System.out.print(idx);
    }
    else{
        System.out.print("not found");
    }
   }
    
}
