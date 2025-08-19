//Rotate an array (left & right)
    import java.util.*;

public class rot_arr{
    public static void main(String args[]){
// Integer a[]={10,30,40,50,69};
// int k=2;
// List<Integer> list=Arrays.asList(a);
// Collections.rotate(list,-k);//right
// Collections.rotate(list,k);//left

// for(int i:a){
//     System.out.print(i+" ");
// }

int a[]={10,20,30,40,50};
int k=2;
int n=a.length;
int temp[]=new int[n];
for(int i=0;i<n;i++){
    //temp[i]=a[(i+k)%n]; //ledt
    temp[i] = a[(i - k + n) % n];//right

}
        System.out.println("Left Rotation: " + Arrays.toString(temp));




    }
}