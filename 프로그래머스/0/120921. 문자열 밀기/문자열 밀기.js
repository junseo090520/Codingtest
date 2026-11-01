function solution(A, B) {
    var answer = -1;
    A = [...A];
    for(let i=0; i<A.length; i++){
        if(A.join("") === B){
            answer = i;
            break;
        }
        var ch = A.splice(A.length-1,1);
        A.splice(0,0,ch.toString())
        console.log(A)
    }
    return answer;
}