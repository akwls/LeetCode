class Solution {
    public String replaceDigits(String s) {
        String answer = "";
        for(int i =0; i<s.length(); i++) {
            if(i%2==1) {
                answer += Character.toString(s.charAt(i-1) + (s.charAt(i)-48));
            }
            else answer += Character.toString(s.charAt(i));
        }
        return answer;
    }
}