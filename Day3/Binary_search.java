import java.util.*;
public class Binary_search {
    // public static void main(String args[]){
    //     int a[]={1,2,3,4,5,6};
    //     int target=4,k;
    //     k=binearysearch(a,target,0,a.length-1);
    //     if(k!=-1){
    //         System.out.print("found at "+ k);
    //     }
    //     else{
    //         System.out.print("Not found");
    //     }
    // }
    // public static int binearysearch(int a[],int key,int s,int e){
    //     while(s<=e){
    //         int mid=s+(e-s)/2;
    //         if(a[mid]==key){
    //             return mid;
    //         }
    //         else if(key>a[mid]){
    //             s=mid+1;
    //         }
    //         else{
    //             e=mid-1;
    //         }
    //     }
    //     return -1;

    // }


    //recurstion

    // public static int binearysearch(int a[],int key,int s,int e){

    //     if(s>e){
    //         return -1;
    //     }
    //     int mid=s+(e-s)/2;
    //     if(a[mid]==key){
    //         return mid;

    //     }
    //     else if(a[mid]<key){
    //          return binearysearch(a,key,mid+1,e);
    // }
    //     else{
    //         return binearysearch(a,key,s,mid-1);
           
    //     }
    // }


    //built in function
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int key=4;
        int idx=Arrays.binarySearch(a,key);
        if(idx>=0){
            System.out.print(idx);
        }
        else{
            System.out.print(-1);
        }
    }


}
