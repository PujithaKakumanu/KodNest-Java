
import java.util.*;

public class HashDemo1 {

    public static void main(String[] args) {
        Map<Character, Integer> freq = new HashMap<>();
        freq.put('a', 5);
        freq.put('b', 7);
        freq.put('a', 12);
        System.out.println(freq);

        freq.put('c', freq.getOrDefault('c', 0) + 1);
        System.out.println(freq);
        freq.put('b', freq.getOrDefault('b', 0) + 1);
        System.out.println(freq);

    }

}
