function solution(a, b) {
    let sum = +(""+a+""+b);
    let sum2 = +(""+b+""+a);
    if(sum>=sum2){
        return sum;
    }
    return sum2;
}