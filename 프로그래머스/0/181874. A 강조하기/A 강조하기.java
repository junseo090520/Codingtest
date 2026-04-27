class Solution {
    public String solution(String myString) {
        String answer = "";
        String strings = myString.toLowerCase();
        for(int i=0; i<strings.length(); i++){
            if(strings.charAt(i)=='a'){
                answer += 'A';
            }else{
                answer += strings.charAt(i);
            }
        }
        return answer;
    }
}