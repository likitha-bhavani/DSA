public class lcm {
    public static void main(String args[]){
        int n1=12,n2=18;
        int Gcd=0,lcm=0;
        // for(int i=1;i<=n1 && i<=n2 ;i++){
        //     if(n1%i==0 && n2%i==0){
        //         Gcd=i;
        //     }
        // }
        // lcm=(n1*n2)/Gcd;
        // System.out.print(lcm);


        lcm=(n1>n2)?n1:n2;
        while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.print(lcm);
                break;
            }
            lcm++;
        }
    }
}
