function solution(binomial) {
    var answer = 0;
    let Calculation = [];
    Calculation = binomial.split(" ");
    let num1 = +Calculation[0];
    let num2 = +Calculation[2];
    switch(Calculation[1]){
        case '+' : 
            answer = num1+num2;
            break;
        case '-' : 
            answer = num1-num2;
            break;
        case '*' : 
            answer = num1*num2;
            break;
    }
    return answer;
}