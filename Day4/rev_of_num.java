//reverse of anumber
public class rev_of_num{
    public static void main(String args[]){
       int n=123;
       int rev=0;
       while(n>0){
        int digit=n%10;
        rev=rev*10+digit;
        n/=10;
       } 
       System.out.print(rev);
    }
}