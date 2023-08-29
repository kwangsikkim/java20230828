package codingtest;

import java.util.ArrayList;

public class Day1_1 {
    public static String[] solution(String[] names) {
        String[] answer = {};
        ArrayList<String> name2 = new ArrayList<String>();

        for(int i=0; i<names.length; i++){
            if(i%5 == 0){
                name2.add(names[i]);
            }
        }
        answer = new String[name2.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = name2.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(solution(names));
    }
}
