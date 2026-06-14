import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String lower = "", upper = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                lower+=c;
            }else{
                upper+=c;
            }
        }
        char []lowers = lower.toCharArray();
        char []uppers = upper.toCharArray();
        Arrays.sort(lowers);
        Arrays.sort(uppers);
        StringBuilder sbLower = new StringBuilder(new String(lowers));
        StringBuilder sbUpper = new StringBuilder(new String(uppers));
        return sbLower.reverse().toString() + sbUpper.reverse().toString();
    }
}