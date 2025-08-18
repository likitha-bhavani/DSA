import java.util.Arrays;
public class rotateleftarr {
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }
        System.arraycopy(rotated, 0, arr, 0, n); // copy back
    }
    public static void rotateRight(int[] arr, int k) {
    int n = arr.length;
    k = k % n;
    int[] rotated = new int[n];

    for (int i = 0; i < n; i++) {
        rotated[(i + k) % n] = arr[i];
    }
    System.arraycopy(rotated, 0, arr, 0, n);
}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateLeft(arr, 2);
         System.out.println(Arrays.toString(arr));// [3, 4, 5, 1, 2]
         int[] a = {1, 2, 3, 4, 5};
        rotateRight(a, 2);
        System.out.println(Arrays.toString(a)); // [ 4, 5, 1, 2,3]
    }
}

    

