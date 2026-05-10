function solution(myString) {
    var answer = [];
    let str = myString.split('x');
    for(let i of str){
        answer.push(i.length);
    }
    return answer;
}