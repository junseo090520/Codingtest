class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int pice = slice;
        while(true){
            if((pice/n)>=1)break;
            else {
                pice+=slice;
                answer++;
            }
        }
        return answer;
    }
}