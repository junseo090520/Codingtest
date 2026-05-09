function solution(arr, intervals) {
    var answer = [];
    for(let i of intervals){
        for(let j=i[0]; j<=i[1]; j++){
            answer.push(arr[j]);
        }
    }
    return answer;
}