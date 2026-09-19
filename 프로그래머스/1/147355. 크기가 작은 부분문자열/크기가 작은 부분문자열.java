class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long arr [] = new Long [t.length() - p.length() + 1];
        for(int i=0; i<arr.length; i++){
            arr[i] = Long.parseLong(t.substring(i,i+p.length()));           
        }
        Long num = Long.parseLong(p);
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= num){
                answer++;
            }
        }    
        return answer;
    }
}