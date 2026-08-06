function solution(intStrs, k, s, l) {
    var answer = [];
    for(let i of intStrs){
        var num = Number(i.substr(s,l))
        if(num > k){
            answer.push(num)
        }
    }
    return answer;
}