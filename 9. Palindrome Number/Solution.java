class Solution {
    public boolean isPalindrome(int x) {
        String tmp = Integer.toString(x);
        for(int i=0; i<tmp.length(); i++) {
            if(tmp.charAt(i) != tmp.charAt(tmp.length() - 1 -i)) {
                return false;
            }
        }
        return true;
    }
}