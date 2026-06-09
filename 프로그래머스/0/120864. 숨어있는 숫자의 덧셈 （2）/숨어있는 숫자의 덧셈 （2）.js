function solution(my_string) {
    var answer = 0;
    let nums = ""
    for(let ch of my_string){
        if(isNaN(ch)){
            nums += " ";
        }else{
            nums += ch;
        }
    }
    let numArr = nums.split(" ");
    for(let num of numArr){
        answer += +num;
    }
    return answer;
}