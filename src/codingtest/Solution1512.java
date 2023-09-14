package codingtest;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {


//        Map<Integer, List<Integer>> map = Arrays.stream(nums)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        int sum = map.values()
                .stream()
                .map(n->(n)*(n-1)/2)
                .mapToInt(n->n.intValue())
                .sum();

        return sum;



    }
}
