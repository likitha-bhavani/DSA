//Check if two strings are anagrams

import java.util.*;

public class anagrams{
    public static void main(String args[]){
      String s1="listen";
      String s2="silent";
      if(s1.length()!=s2.length()){
        System.out.print("not");
        return;
      }
      char[] S1=s1.toCharArray();
      char[] S2=s2.toCharArray();
      Arrays.sort(S1);
      Arrays.sort(S2);
      if(Arrays.equals(S1,S2)){
        System.out.print("ANagram");
      }
      else{
        System.out.print("Not anagram");
      }
    //    HashMap<Character,Integer> frq1=new HashMap<>();
    //   for(char ch:s1.toCharArray()){
    //     frq1.put(ch, frq1.getOrDefault(ch, 0) + 1);

    //   }
    //   for(char ch:s2.toCharArray()){
    //     if(!frq1.containsKey(ch)){
    //         System.out.print("NOtanagram");
    //         return;
    //     }
    //     frq1.put(ch,frq1.get(ch)-1);
    //     if(frq1.get(ch)==0){
    //         frq1.remove(ch);
    //     }

    //   }
    //   if(frq1.isEmpty()){
    //     System.out.println("anagram");
    //   }else{
    //     System.out.print("NOt");
    //   }


    }
}