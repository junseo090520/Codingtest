function solution(myString, pat) {
    var answer = 0;
    let str = "";
    for(let ch of myString){
        if(ch==='A'){
            str += 'B';
        }else{
            str += 'A';
        }
    }
    if(str.indexOf(pat)!==-1){
        answer = 1;
    }
    return answer;
}