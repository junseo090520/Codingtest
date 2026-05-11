function solution(myString, pat) {
    var answer = 1;
    if(myString.toLowerCase().indexOf(pat.toLowerCase())===-1){
        answer = 0;
    }
    return answer;
}