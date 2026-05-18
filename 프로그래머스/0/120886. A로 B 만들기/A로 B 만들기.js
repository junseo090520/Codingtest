function solution(before, after) {
    var answer = 0;
    let arr = [];
    for(let ch of before){
        arr.push(ch);
    }
    for(let ch of after){
        if(arr.indexOf(ch)===-1){
            return 0;
        }else{
            arr[arr.indexOf(ch)] = "";
        }
    }
    return 1;
}