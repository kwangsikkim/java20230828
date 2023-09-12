package codingtest;

import java.util.HashMap;
import java.util.Map;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if (map.containsKey(num)) {
                int oldValue = map.get(num);
                map.put(num, oldValue + 1);
            } else {
                map.put(num, 1);        // 첫 발견
            }
        }
        int sum =0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
