import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0)a.add(numlist[i]);
        }
        int[] answer = new int[a.size()];
        for(int i=0; i<a.size(); i++){
            answer[i]=a.get(i).intValue();
        }
        return answer;
    }
}