public class count_sort {
    public static void main(String args[]){
        int a[]={23,1,2,43,54,45};
        for(int i:a){
            System.out.print(i+" ");
        }
        countSort(a);
        System.out.println("\n after sorting :");
        for(int j:a){
            System.out.print(+j+" ");
        }

    }
    public static void countSort(int a[]){
       int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        int c[]=new int[max+1];
        for(int i=0;i<a.length;i++){
         c[a[i]]++;
        }
        
        int indx=0;
        for(int i=0;i<=max;i++){
            while(c[i]!=0){
                a[indx]=i;
                c[i]--;
                indx++;
            }
        }
    }
}
