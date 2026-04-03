class Solution {
    public int[] solution(int n) {
        int cnt=0;
        for(int i=0; i<n; i+=2){
            cnt++;
        }
        int plus=1;
        int answer[] = new int[cnt];
        for(int i=0; i<answer.length; i++){
            answer[i]=plus;
            plus+=2;
        }
        return answer;
    }
}