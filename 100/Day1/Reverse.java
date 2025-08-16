//Reverse a string (with & without built-in functions)
public class Reverse {
    public static void main(String args[]){
        String str="Likitha Bhavani";
        //String s="";
        StringBuilder s=new StringBuilder(str);
        // for(int i=str.length()-1;i>=0;i--){
        //     s+=str.charAt(i);

        // }
        int j=str.length()-1;
      int i=0;
      while(i!=j){
        char t=s.charAt(i);
        s.setCharAt(i,s.charAt(j));
        s.setCharAt(j,t);
        i++;
        j--;
      }
        System.out.println("String is "+ s.toString());
        // System.out.println("Using with bulid in functions:"+ new StringBuilder(str).reverse());
    }
    
}
