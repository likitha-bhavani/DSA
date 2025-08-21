//armstrong number
public class armstrong {
    public static void main(String args[]){
        int n=153;
        int num=0;
        int r=0;
       // int d=String.valueOf(n).length();
        int temp=n;
        int digits=0;
        while(temp>0){
            digits++;
            temp/=10;
        }


        int v=n;
        while(n>0){
            num=n%10;
            r+=Math.pow(num,digits);
            n/=10;

        }
        if(r==v){
            System.out.print("armstrong number");
        }
        else{
            System.out.print("not armstrong number");
        }
    }
}
