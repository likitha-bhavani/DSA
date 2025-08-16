//Find first non-repeating character in a string
import java.util.*;
public class Non_rep_cha{
    // public static void main(String args[]){
    //     String s="iikitha";
    //     for(int i=0;i<s.length();i++){
    //         boolean u=true;
    //         for(int j=0;j<s.length();j++){

    //             if(i!=j && s.charAt(i)==s.charAt(j)){
    //                 u=false;
    //                 break;
    //             }


    //         }
    //         if(u){
    //             System.out.println(s.charAt(i));
    //             return;
    //         }
    //     }
      
    //         System.out.print(-1);
      
    // }

    public static void main(String args[]){
        String s="likitha";
        //sisisk
        HashMap<Character,Integer> frq=new HashMap<>();
        for(char ch:s.toCharArray()){
            frq.put(ch,frq.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray()){
            if(frq.get(ch)==1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println(-1);


    }
}