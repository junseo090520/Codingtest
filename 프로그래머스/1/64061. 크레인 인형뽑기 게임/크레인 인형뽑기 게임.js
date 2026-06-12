function solution(board, moves) {
    var answer = 0;
    let stack = [];
    for(let move of moves){
        for(let i=0; i<board.length; i++){
            let n = board[i][move-1];
            board[i][move-1] = 0;
            if(n!=0){
                if(stack.length===0){
                    stack.push(n);
                }else{
                    let temp = stack.pop();
                    if(temp === n){
                        answer+=2; 
                    }else{
                        stack.push(temp);
                        stack.push(n);
                    }
                }
                break;
            }
        }
    }
    return answer;
}