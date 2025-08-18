public class Largest {
    public static void main(String[] args) {
        int a[] = {2, 34, 56, 5, 67};
        
        // Handle edge cases
        if (a.length < 2) {
            System.out.println("Array needs at least 2 elements");
            return;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Single pass O(n) solution
        for (int num : a) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;           // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;     // Update only second largest
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements are same)");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
/*method 2: Using Arrays.sort time complexity O(n log n)
int a[]={2,34,56,5,67};
    Arrays.sort(a);
    System.out.println("Largest element is: " + a[a.length - 2]); */