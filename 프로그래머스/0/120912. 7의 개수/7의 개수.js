function solution(array) {
    var answer = 0;
    let str = "";
    for(let ch of array){
        str+=ch;
    }
    for(let ch of str){
        if(ch==='7'){
            answer++;
        }
    }
    return answer;
}