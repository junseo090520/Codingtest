function solution(age) {
    var answer = '';
    age = ""+age;
    for(let i=0; i<(age.length); i++){
        answer += String.fromCharCode((age.charCodeAt(i)+49));
    }
    return answer;
}