public class missingno {
    public static void main(String[] args) {
        int a[]={3,5,1,2,4,6,8,9},xor=0;
        //usig xor
        for(int i=1;i<=a.length+1;i++){//range is 1-n so <= is used if range is(0-n) < is used in for condition
            xor=xor^i;
        }
        for(int n:a){
            xor=xor^n;
        }
        System.out.print(xor);
    }
}
/* formula:total-given numbers in array
 for(i=0;i<a.length;i++){
 n=Math.max(n,a[i]);
 sum=sum+a[i];
 }
 int t=((n+1)*n)/2;
 System.out.print(t-sum);
 */
