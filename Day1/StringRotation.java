//check string is rotation of another

public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length() && s1.length() > 0) {
            String doubled = s1 + s1;
            return doubled.contains(s2);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("ABCD", "BACD")); // true
        System.out.println(isRotation("ABCD", "ACBD")); // false
    }
}
