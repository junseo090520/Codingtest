class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int [arr.length];
        int num=arr.length%2;
        for(int i=0; i<arr.length; i++){
            if(i%2==num)
                answer[i]=arr[i];
            else 
                answer[i]=arr[i]+n;
        }
        return answer;
    }
}