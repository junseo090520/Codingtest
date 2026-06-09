function solution(spell, dic) {
    var answer = 0;
    for(let str of dic){
        let bool = true;
        for(let ch of spell){
            if(str.indexOf(ch)===-1){
                bool = false;
                break;
            }
        }
        if(bool){
            return 1;
        }
    }
    return 2;
}