import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(String s) {
        int count=0;
        int remove=0;
        
        while (!s.equals("1")) {
            count++;    // 회차 계산
            System.out.println("회차 : " + count);
            System.out.println("이진변환 이전 : " + s);
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '1') {
                    sb.append(s.charAt(i));  
                } else {
                     remove++;   // 제거한 0개수 계산
                }
            }
            System.out.println("0 제거 후 : " + sb);
            System.out.println("제거한 0의 개수 : " + remove);
            s = Integer.toBinaryString(sb.length());
            System.out.println("이진변환 이후 : " + s);
        }
        
        int[] answer = {count, remove};
        return answer;
    }
}
