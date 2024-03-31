class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] values = s.split(" ");
        int min = Integer.parseInt(values[0]);  // 초기값 세팅
        int max = Integer.parseInt(values[0]);  // 초기값 세팅
        
        for (int i=1; i<values.length; i++) {
            System.out.println(values[i]);
            int val = Integer.parseInt(values[i]);
            if (min > val) min = val;
            if (max < val) max = val;
            
        }
        answer = min + " " + max;
        return answer;
    }
}
