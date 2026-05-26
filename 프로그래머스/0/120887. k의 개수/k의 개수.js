function solution(i, j, k) {
    var answer = 0;
    let strNum = "";
    for(let n=i; n<=j; n++){
        strNum+=n;
    }
    for(let ch of strNum){
        if(+ch===k){
            answer++;
        }
    }
    return answer;
}