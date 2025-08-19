//find intersection of two arrays
import java.util.*;
public class intersection_arr {
    public static void main(String args[]){
        int a[]={1,2,3,4};
        int b[]={3,4,5,6};
ArrayList<Integer> list=new ArrayList<>();
for(int i:a){
    list.add(i);
}
        for(int i:b){
            if(list.contains(i)){
                    System.out.print(i+" ");
            }
        }
    }
}
