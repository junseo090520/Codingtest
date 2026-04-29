function solution(my_string) {
    var answer = [];
    for(let i of my_string){
        if(!isNaN(i)){
            answer.push(Number(i));
        }
    }
    answer.sort();
    return answer;
}