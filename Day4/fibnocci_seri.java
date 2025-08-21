//fabinocci series 
public class fibnocci_seri {
    public static void main(String args[]){
        int n=5;
        int a=0,b=1;
        // System.out.print(a + " "+ b+ " ");

        //with oout using a,b;
        for(int i=0;i<n;i++){
        System.out.print(fab(i)+" ");
    }
        //fab(n-2,a,b);


        //iterative form
        // for(int i=2;i<n;i++){
        //     int c=a+b;
        //     System.out.print(c+" ");
        //     a=b;
        //     b=c;

        // }

        //dynamic programming
        fibdy(n);

        
    }
    // public static void fab(int n,int a,int b){
    //     if(n==0){
    //         return;

    //     }
    //     int c=a+b;
    //     System.out.print(c+" ");
    //     fab(n-1,b,c);
    // }

    //recursive approch
public static int fab(int n){
    if(n<=1){
        return n;
    }
    return fab(n-1)+fab(n-2);
}

public static void fibdy(int n){
    int dp[]=new int[n+1];
    dp[0]=0;
    if(n>0){
        dp[1]=1;
    }
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    for(int i=0;i<=n;i++){
        System.out.print(dp[i]+" ");

    }
}
}
