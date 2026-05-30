function solution(my_str, n) {
    var answer = [];
    let i = 0;
    while(i+n==my_str.length || i<my_str.length){
        answer.push(my_str.substring(i,i+n));
        i+=n;
    }
    return answer;
}