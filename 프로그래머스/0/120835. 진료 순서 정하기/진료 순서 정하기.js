function solution(emergency) {
    var answer = [];
    for(let i=0; i < emergency.length; i++){
        let num = emergency[i];
        answer[i]=1;
        for(let j=0; j < emergency.length; j++){
            if(num < emergency[j]){
                answer[i]++;
            }
        }
    }
    return answer;
}