function solution(arr) {
    var answer = [];
    for(let num of arr){
        for(let j=0; j<num; j++){
            answer.push(num);
        }
    }
    return answer;
}