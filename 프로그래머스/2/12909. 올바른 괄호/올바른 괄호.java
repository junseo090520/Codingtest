class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int left = 0,right = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                left++;
            }else {
                right++;
            }
            if(left<right){
                answer = false;
                break;
            }
        }
        if(s.charAt(0)==')'){
            answer = false;
        }
        else if(s.charAt(s.length()-1) == '('){
            answer = false;
        }
        else if(s.length()%2==1){
            answer = false;
        }
        else if(left!=right){
            answer = false;
        }
        
        return answer;
    }
}