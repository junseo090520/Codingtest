function solution(my_string, target) {
    var answer = 0;
    if(my_string.indexOf(target)===-1){
        answer = 0;
    }else{
        answer = 1;
    }
    return answer;
}