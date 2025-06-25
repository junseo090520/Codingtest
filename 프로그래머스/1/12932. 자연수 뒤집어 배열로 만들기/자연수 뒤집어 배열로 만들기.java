class Solution {
    public int[] solution(long n) {
        int cnt=0;
        long temp=n;
        do{temp=temp/10;
            cnt++;
           }while(temp!=0);
        int[] answer = new int[cnt];
        for(int i=0; i<cnt; i++){
            answer[i]=(int)(n%10);
            n=n/10;
            }
        return answer;
    }
}