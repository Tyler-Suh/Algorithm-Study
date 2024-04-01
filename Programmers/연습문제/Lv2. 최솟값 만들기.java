import java.util.*;
import java.lang.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int len = A.length;
        
        // 크기 순으로 정렬
        Arrays.sort(A); 
        Arrays.sort(B);
        // System.out.println("len : " + len);
        for (int i=0; i<len; i++) {
            // System.out.println("A : " + A[i] + "  B : " + B[i]);
            answer += A[i] * B[len - i - 1];
        }

        return answer;
    }
}
