public class bubble_sort {
    public static void main(String args[]){
        int a[]={43,45,76,23,54};
        bubbleSort(a,a.length-1);
          System.out.println("after sorting:");
        for(int i:a){
          
            System.out.print(i+" ");
        }
    }
    // public static void bubbleSort(int a[]){
    //     for(int i=0;i<a.length;i++){
    //         boolean swapped = false;

    //         for(int j=0;j<a.length-i-1;j++){
    //             if(a[j]>a[j+1]){
    //                 int t=a[j];
    //                 a[j]=a[j+1];
    //                 a[j+1]=t;
    //                 swapped = true;

    //             }
    //         }
    //         if (!swapped) break;
    //     }
    // }
public static void bubbleSort(int a[],int n){
    if(n==1){
        return ;
    }
    for(int i=0;i<n-1;i++){
        if(a[i]>a[i+1]){
            int t=a[i];
            a[i]=a[i+1];
            a[i+1]=t;
        }
    }
    bubbleSort(a, n-1);

}

}
