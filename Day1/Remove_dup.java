//Remove duplicates from a string

import java.util.HashSet;

public class Remove_dup {
    public static void main(String args[]){
        String s="likitha";
        StringBuilder str=new StringBuilder();
        HashSet<Character> frq=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(!frq.contains(ch)){
                frq.add(ch);
                str.append(ch);
            }
        }
        System.out.println(str.toString());


    }
}
