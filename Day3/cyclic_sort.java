public class cyclic_sort {
    public static void main(String args[]){
        int a[]={3,2,1,4,5};
        for(int i:a){
            System.out.print(i+" ");
        }
        CyclicSort(a);
        System.out.println();
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    public static void CyclicSort(int a[]){
        int i=0;
        while(i<a.length){
        int current=a[i]-1;

        if(a[i]!=a[current]){
            int t=a[i];
            a[i]=a[current];
            a[current]=t;
        }
        else{
            i++;
        }
    }
    }
    
}
