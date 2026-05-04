function solution(num, k) {
    var answer = 0;
    num = ""+num
    answer = num.indexOf(k);
    if(answer!==-1){
        answer+=1;
    }
    return answer;
}