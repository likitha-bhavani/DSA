public class quick_sort {
    public static void main(String args[]){
        int a[]={32,12,34,1,4,6,45,32};
        for(int i:a){
            System.out.print(i+" ");

        }
        QuickSort(a,0,a.length-1);
        System.out.println("after sorting :");
        for(int j:a){
            System.out.print("\n"+j+" ");
        }
    }
        public static void QuickSort(int a[],int i,int j){
            if(i<j){
                int idx=partition(a,i,j);
                QuickSort(a,i,idx-1);
                QuickSort(a,idx+1,j);
            }
        }
        public static int partition(int a[],int st,int ed){
            int pivot=a[st];
            int i=st;
            int j=ed;
            while(i<j){
              while(i<=ed && a[i]<=pivot){
                i++;
              }
            
            while(j>=st && a[j]>pivot){
                j--;
            }
           if(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
           }
            
        }
        int t=a[st];
        a[st]=a[j];
        a[j]=t;
        return j;

        }
}
