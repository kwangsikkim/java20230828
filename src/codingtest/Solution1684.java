package codingtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.reflect.Array.set;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> chars = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            chars.add(c);
        }
        int count = 0;
        for (String word : words) {
            boolean consistentString = true;
            for (char c : word.toCharArray()) {
                if (!chars.contains(c)) {
                    consistentString = false;
                    break;
                }
            }

            if (consistentString) {
                count++;
            }
        }

        return count;
    }
}
