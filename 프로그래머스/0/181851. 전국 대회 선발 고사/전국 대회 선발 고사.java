class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int a = 10000;
        int count = 0;
        for(int i=1; i<=rank.length; i++){
            for(int j=0; j<rank.length; j++){
                if(rank[j] == i && attendance[j]){
                    answer += j*a;
                    count++;
                    a /= 100;
                }
            }
            if(count==3)break;
        }
        return answer;
    }
}