//factorial of number
public class factorial {
    public static void main(String args[]){
        int n=5,fat=1;
        System.out.print(fact(n));


        // for(int i=1;i<=n;i++){
        //     fat*=i;
        // }
        // System.out.print(fat);
int i=1;
        while(i<=n){
            fat*=i;
            i++;
        }
        System.out.print(fat);
     


    }
    public static int fact(int n){
           if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
