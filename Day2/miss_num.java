//Find missing number in a sequence
public class miss_num{
    public static void main(String args[]){
        int a[]={1,2,4,5,6};
        //int sum=0;
       int n=a.length+1;
    //    int total=n*(n+1)/2;
    //     for(int i:a){
    //         sum+=i;
    //     }
    //     System.out.print(Math.abs(total-sum));


    int xorArr = 0;
        for (int num : a) {
            xorArr ^= num;  
        }

        int xorSeq = 0;
        for (int i = 1; i <= n; i++) {
            xorSeq ^= i;    
        }

        int missing = xorArr ^ xorSeq;
        System.out.println("Missing number is: " + missing);
    }
}