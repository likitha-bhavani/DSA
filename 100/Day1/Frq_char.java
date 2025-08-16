import java.util.HashMap;  // import HashMap class

public class Frq_char {
    public static void main(String[] args) {
        String str = "hello";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freq);
    }
}
