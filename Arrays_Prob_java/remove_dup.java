import java.util.*;
public class remove_dup {
    public static void main(String[] args) {
        int a[]={5, 3, 1, 2, 3, 2, 4, 5, 1};
        //method-1 time,space:O(N)
        Set<Integer> s=new HashSet<>();
        for(int n:a){
            if(!s.contains(n)){
                s.add(n);
            }
        }
        int[] result = new int[s.size()];
        int i = 0;
        for (int num : s) {
            result[i++] = num;
        }
        for(int j:result){
        System.out.print(j+" ");}
    }
}
