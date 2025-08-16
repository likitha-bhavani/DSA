import java.util.*;

public class Substring_wo_rep {
    public static void main(String args[]) {
        String s = "likitha";
        int n = s.length();
        
        int i = 0, j = 0, max = 0; 
        Set<Character> set = new HashSet<>();

        while (i < n && j < n) {
            
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, j - i); 
            } 
          
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println("Longest substring length: " + max);
    }
}
