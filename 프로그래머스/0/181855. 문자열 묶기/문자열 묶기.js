function solution(strArr) {
    var answer = 0;
    var len = new Array(30).fill(0)
    for(let i of strArr){
        len[i.length - 1] += 1
    }
    answer = Math.max(...len)
    return answer;
}