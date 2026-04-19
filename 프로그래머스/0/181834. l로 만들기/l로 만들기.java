class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            switch(myString.charAt(i)){
                case 'a':case 'b':case 'c':case 'd':case 'e':case 'f':case 'g':case 'h':case 'i':case 'j':case 'k' : answer+= 'l';
                    break;            
                default : answer += myString.charAt(i);
            }
        }
        return answer;
    }
}