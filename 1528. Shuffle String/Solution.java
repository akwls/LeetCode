class Solution {
    public String restoreString(String s, int[] indices) {
        char[] tmp = new  char[s.length()];
        for(int i=0; i<s.length(); i++) {
            tmp[indices[i]] = s.charAt(i);
        }
        String answer = "";
        for(int i=0; i<tmp.length; i++) {
            answer += Character.toString(tmp[i]);
        }
        return answer;
    }
}