function solution(my_string, s, e) {
    var answer = '';
    for(let i=0; i<my_string.length; i++){
        if(i>=s && i<=e){
            answer+=(my_string.charAt(e-i+s));
        }else{
            answer+=(my_string.charAt(i));
        }
    }
    return answer;
}