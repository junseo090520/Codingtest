import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max=0;
        int sum=0;
        int cnt=0;
        
        for(int i=0; i<3; i++){
            if(max<sides[i])max=sides[i];
            if(max==sides[i])cnt=i;
        }
        for(int i=0; i<3; i++){
            if(i==cnt)continue;
            else sum+=sides[i];
        }
        if(sum>max)answer=1;
        else if(sum<=max)answer=2;
        return answer;
    }
}