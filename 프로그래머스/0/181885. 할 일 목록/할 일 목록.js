function solution(todo_list, finished) {
    var answer = [];
    let count = 0;
    for(let bool of finished){
        if(!bool){
            answer.push(todo_list[count]);
        }
        count++;
    }
    return answer;
}