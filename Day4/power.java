//power of a number
public class power {
    public static void main(String args[]){
        int a=2,b=0;
        int pow=a;
        if(b==0 )
            {
            pow=1;
        }
        else{
        for(int i=1;i<b;i++){
            pow*=a;
        }
    }
        System.out.print(pow);
    }
}
