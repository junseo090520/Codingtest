function solution(x) {
    var answer = true;
    x = ""+x;
    let sum=0;
    for(let num of x){
        sum += +num;
    }
    if((x%(+sum))!==0){
        answer = !answer;
    }
    return answer;
}