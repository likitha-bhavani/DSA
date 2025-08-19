//Find second largest element in array
import java.util.*;
public class sec_lar{
    public static void main(String args[]){
        int a[]={2,34,1,5,24};
        // Arrays.sort(a);
        // System.out.println("secound largest :"+ a[a.length-2]);

        int max=a[0],s_max=a[0];
        for(int i :a){
            if(i>max){
                s_max=max;
                max=i;
            }
            else if(i>s_max &&i!=max){
                s_max=i;
            }
        }
        System.out.println("sec largest:"+s_max);

    }
}