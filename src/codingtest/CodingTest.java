package codingtest;



public class CodingTest {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<can.length; j++){
                babbling[i] = babbling[i].replace(can[j],"Z");
                System.out.println(babbling[i]);
                if(babbling[i].replace("Z","").equals("")){

                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling));
    }
}

