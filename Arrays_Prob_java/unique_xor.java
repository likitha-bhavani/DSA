public class unique_xor {
        
        public static int findUnique(int[] nums) {
            int unique = 0;
            for (int num : nums) {
                unique ^= num;
            }
            return unique;
        }
        public static void main(String[] args) {
            int a[]={1,1,2,3,3};
            System.out.print(findUnique(a));
        }
    }

