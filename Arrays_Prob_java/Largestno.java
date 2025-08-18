class Largestno{
    public static void main(String[] args) {
        int a[]={3,67,8,9,23};
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            large=Math.max(large,a[i]);
            small=Math.min(small,a[i]);
        }
        System.out.println(large);
        System.out.print(small);
    }
}
// int large = Arrays.stream(a).max().getAsInt();
//int small = Arrays.stream(a).min().getAsInt();