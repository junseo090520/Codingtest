class Solution {
    public int[] solution(int[] array) {
        int max=0,cnt=0;
        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
                cnt=i;
            }
        }
        int[] answer = {max,cnt};
        return answer;
    }
}