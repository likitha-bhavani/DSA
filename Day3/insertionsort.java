public class insertionsort {
    public static void main(String args[]){
        int a[]={3,42,56,32,12};
        insertion_sort(a);
        System.out.print("after sorting ");
        for(int i:a){
            System.out.print(i+" ");
        }

    }
    public static void insertion_sort(int a[]){
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
}
