//Check if a string is palindrome 
public class Str_palindrom{
    public static void main(String args[]){
        String str="solikithas";
        // String rev=new  StringBuilder(str).reverse().toString();
        // System.out.print(str.equals(rev));
        StringBuilder s=new StringBuilder(str).reverse();
        int count=0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)==s.charAt(i)){
                count++;
            }
            else{
                System.out.print("not palindrom");
                break;
            }
        }
        if(count==str.length()){
            System.out.println("palindrom");
        }

    }
}