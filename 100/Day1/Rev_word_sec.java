//Reverse words in a sentence
import java.util.*;
public class Rev_word_sec{
public static void main(String args[]){
String s="Challa likitha bhavani";
String word[]=s.split(" ");
// StringBuilder str=new StringBuilder();
// for(int i=word.length-1;i>=0;i--){
//     str.append(word[i]).append(" ");
// }
// System.out.println(str.toString().trim());
Collections.reverse(Arrays.asList(word));
System.out.println(String.join(" ",word));
}
}