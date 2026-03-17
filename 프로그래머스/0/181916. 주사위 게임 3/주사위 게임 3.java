class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        //4개
        if(a==b && b==c && c==d){
            answer+=1111*a;
        }
        //3개
        else if( a==b && a==c){
            answer+=(10*a+d)*(10*a+d);
        }
        else if(a==b && a==d){
            answer+=(10*a+c)*(10*a+c);
        }
        else if(a==c && a==d){
            answer+=(10*a+b)*(10*a+b);
        }
        else if(b==c && b==d){
            answer+=(10*b+a)*(10*b+a);
        }
        //2개 씩
        else if(a==b && c==d){
            answer+=((a+c)*(Math.abs(a-c)));
        }
        else if(a==c && b==d){
            answer+=((a+b)*(Math.abs(a-b)));
        }
        else if(a==d && b==c){
            answer+=((a+b)*(Math.abs(a-b)));
        }
        //2개가 같고 2개가 다름
        else if(a==b && c!=d){
            answer+=c*d;
        }
        else if(a==c && b!=d){
            answer+=b*d;
        }
        else if(a==d && c!=b){
            answer+=b*c;
        }
        else if(b==c && a!=d){
            answer+=a*d;
        }
        else if(b==d && a!=c){
            answer+=a*c;
        }
        else if(c==d && a!=b){
            answer+=a*b;
        }
        //모두 다른 경우
        else {
            for(int i=0; i<6; i++){
                if(a==i || b==i || c==i || d==i){
                    answer+=i;break;
                }
            }
        }
        return answer;
    }
}