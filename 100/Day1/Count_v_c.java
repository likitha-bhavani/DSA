//Count vowels and consonants
import java.util.*;
public class Count_v_c {
    public static void main(String args[]){
        String a="hElloworld";
        int c1=0,c2=0;
        a=a.toLowerCase();
        // for(char ch:a.toCharArray()){
        //     if (ch >= 'a' && ch <= 'z') {
        //     if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
        //         c1++;
        //     }
        //     else{
        //         c2++;
        //     }
        //     }

        //hashset
        // Set<Character> v = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        // for (char ch : a.toCharArray()) {
        //     if (ch >= 'a' && ch <= 'z') { 
        //         if (v.contains(ch)) {
        //             c1++; 
        //         } else {
        //             c2++; 
        //         }
        //     }
        // }


        System.out.println("vowel count:\t"+ c1);
        System.out.println("consont count:\t"+ c2);

    }
}
