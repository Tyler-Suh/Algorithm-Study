// 수정한 소스
class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);
        // System.out.println("cnt :" + cnt);
        while (true) {
            n++;
            int tmpCnt = Integer.bitCount(n);
            if (tmpCnt == cnt) break; 
        }
        answer = n;
        return answer;
    }
}

// 내가 푼 소스 (정답)
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);
        // System.out.println("count :" + count);
        int tmpCnt = 0;
        int tmp = n+1;
        while (tmpCnt != count) {
            // System.out.println("tmp : " + tmp);
            tmpCnt = Integer.bitCount(tmp);
            // System.out.println("tmpCnt : " + tmpCnt);
            tmp++;
        }
        answer = tmp-1;
        return answer;
    }
}
