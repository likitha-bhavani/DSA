public class selection_sort {
    public static void main(String args[]){
        int a[]={23,42,25,44,6};
        selectionSort(a);
        System.out.println("after sorting:");
        for(int i:a){
            System.out.print(i+ " ");
        }

    }
    public static void selectionSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
            if(a[j]<a[min]){
                min=j;
               
            }
        }
         int t=a[i];
            a[i]=a[min];
            a[min]=t;
    }

        }
    }

