function solution(arr, delete_list) {
    var answer = [];
    for(let i of arr){
        let bool = true;
        for(let j of delete_list){
            if(i==j){
                bool = false;
                break;
            }
        }
        if(bool){
            answer.push(i);
        }
    }
    return answer;
}