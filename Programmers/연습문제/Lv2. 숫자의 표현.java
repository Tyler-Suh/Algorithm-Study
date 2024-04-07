// 수정한 소스
import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 1; // 방법의 수, 본인의 수 1 세팅
        
        for (int i=1; i<=n/2; i++) {
            int sum = i;
            for (int j=i+1; j<=n/2+1; j++) {
                // System.out.println("i : " + i + "  j : " + j + " answer : " + answer);
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
            // System.out.println("i : " + i + " 일때 answer : " + answer);
        }
        
        return answer;
    }
}



// 내가 푼 소스
import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 0; // 방법의 수
        
        for (int i=1; i<=n/2; i++) {
            int sum = i;
            for (int j=i+1; j<=n/2+1; j++) {
                System.out.println("i : " + i + "  j : " + j + " answer : " + answer);
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                }
            }
            System.out.println("i : " + i + " 일때 answer : " + answer);
        }
      
        answer++; // 본인의 수 추가
        
        return answer;
    }
}

