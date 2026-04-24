class Solution {
    public String[] solution(String[] names) {
        int num = 0;
        if(names.length%5==0)num=names.length / 5;
        else num = names.length/5 + 1;
        String[] answer = new String[num];
        int i = 0;
        int count = 0;
        while(true){
            answer[i] = names[count];
            i++;
            count+=5;
            if(i>num-1){
                break;
            }
        }
        return answer;
    }
}