public class merge_sort {
    public static void main(String args[]){
        int a[]={23,1,4,76,45,90,34,23,85,};
        for(int i:a){
            System.out.print(i+" ");
        }
        mergeSort(a,0,a.length-1);
        System.out.println("after sorting");
         for(int j:a){
            System.out.print(j+" ");
        }
       
    }
    public static void mergeSort(int a[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);

        }
    }
    public static void merge(int a[],int low,int mid,int high){
    int[] temp = new int[high - low + 1];

        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];

        }
        while(j<=high){
            temp[k++]=a[j++];
        }
        
for(int l=0;l<temp.length;l++){
    a[low+l]=temp[l];
}

    }
}
