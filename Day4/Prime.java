//prime or not
import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                break;
            }

        }
        if(n<2){
            System.out.print("not prime");
        }
        else if(count==0){
            System.out.print("prime number");
        }
        else{
            System.out.print("not prime");
        }
    


    }
}
