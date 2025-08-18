import java.util.*;
public class insertion_array {
    public static void main(String args[]){
        int []a = {1, 2, 2, 3, 4};
        int []b = {2, 2, 4, 6};
        ArrayList<Integer> al=new ArrayList<>();
        for(int n:a){
            al.add(n);
        }
        for(int n:b){
            if(al.contains(n)){
                System.out.print(n+" ");// to avoid duplicate use set if mentioned
            }
        }
    }
}
