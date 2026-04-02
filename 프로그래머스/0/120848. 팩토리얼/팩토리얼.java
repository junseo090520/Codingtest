class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        // n7   num1 i1
        // n7   num2 i2
        // n7   num6 i3
        // n7   num24
        int i=1;
        while(true){
            num *= i;
            if(num==n){
                answer=i;
                break;
            }
            else if(num>n){
                answer=i-1;
                break;
            }
            i++;
        }
        return answer;
    }
}