//sum of digits 
public class sum_of_digits {
    public static void main(String args[]){
        int n=1154;
                int num=n,r=0;

        while(n>0){
            num=n%10;
            r+=num;
            n/=10;

        }
        System.out.println(r);

    }
}
