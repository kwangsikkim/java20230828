package codingtest;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for(char c: jewels.toCharArray()) {
            jewelSet.add(c);
        }
        int cnt = 0;
        for(int i=0; i<stones.length(); i++){
            if(jewelSet.contains(stones.charAt(i))){
                cnt++;
            }
        }
        return cnt;

    }
}
