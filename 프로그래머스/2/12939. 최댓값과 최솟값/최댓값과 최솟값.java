import java.util.StringTokenizer;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer strToken = new StringTokenizer(s);
        int max = Integer.parseInt(strToken.nextToken());
        int min = max;
        while(strToken.hasMoreTokens()){
            int num = Integer.parseInt(strToken.nextToken());
            if(num>max){
                max = num;
            }else if(num<min){
                min = num;
            }
        }
        answer = min+" "+max;
        return answer;
    }
}