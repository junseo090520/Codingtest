class Solution {
    public int solution(int order) {
        int answer = 0;
        int num = order;
        while(true){
            if((num % 10 == 3 ) || (num % 10 == 6 ) || (num % 10 == 9 )){
                answer++;
            }else if(num/10==0){
                break;
            }
            num/=10;
        }
        return answer;
    }
}