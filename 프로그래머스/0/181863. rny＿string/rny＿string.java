class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(int i=0; i<rny_string.length(); i++){
            char s = rny_string.charAt(i);
            if(s=='m'){
                answer+= "rn";
            }
            else {
                answer+= s;
            }
        }
        return answer;
    }
}