function solution(letter) {
    var answer = '';
    let arr = letter.split(" ");
    let morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."];
    for(let ch of arr){
        answer+=String.fromCharCode(morse.indexOf(ch)+97);
        console.log(morse.indexOf(ch));
    }
    return answer;
}