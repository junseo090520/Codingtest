class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        boolean chack = true;
        for(int i=idx; i<arr.length; i++){
            if(arr[i]==1){
                answer=i;
                chack = false;
                break;
            }
            
        }
        if(chack)answer=-1;
        return answer;
    }
}