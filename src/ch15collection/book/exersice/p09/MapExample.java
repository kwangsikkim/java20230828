package ch15collection.book.exersice.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; // 최고점을 받은 아이디를 저장하는 변수
        int max = 0;   // 최고점을 저장하는 변수
        int total = 0; // 점수 합계를 저장하는 변수

        // 작성
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue()>max) {
                name = entry.getKey();
                max = entry.getValue();
            }
            total += entry.getValue();
        }

        int avg = total / map.size();

        System.out.println("평균 점수: " + avg);
        System.out.println("최고 점수: " + max);
        System.out.println("최고점 아이디: " + name);


    }
}
