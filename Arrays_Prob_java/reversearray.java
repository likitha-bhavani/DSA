public class reversearray {
    public static void main(String[] args) {
        int a[]= {2, 34, 56, 5, 67};
        int i=0,j=a.length-1;
        //time complexity: O(n)
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
        for(int n:a){
            System.out.print(n+" ");
        }
    }
}
/* method-2 timecomplexity O(n)
Integer a[] = {2, 34, 56, 5, 67};
Collections.reverse(Arrays.asList(a));
System.out.println(Arrays.toString(a));*/
