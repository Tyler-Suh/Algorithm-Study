// 내가 푼 소스  - 44점
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        for (int i=0; i<arr.length; i++){
            String val = arr[i].trim();
            if (!val.isEmpty() && val.length() != 0) {
                answer += val.substring(0, 1).toUpperCase();
                answer += val.substring(1).toLowerCase();
                answer += " ";
            }
        }
        answer = answer.trim();
     
        return answer;
    }
}

// 답지 참고 답안
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.toLowerCase().split("");
        boolean flag = true;
        for (int i=0; i<arr.length; i++) System.out.println(arr[i]);
        for (String now : arr) {
            answer += flag ? now.toUpperCase() : now;
            flag = now.equals(" ") ? true : false;
        }
     
        return answer;
    }
}

