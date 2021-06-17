class Solution {
    public int numberOfMatches(int n) {
        int team = n;
        int answer = 0;
        while(team>1) {
            answer += team/2;
            if(team%2==1) team = team/2 + 1;
            else team /= 2;
        }
        return answer;
    }
}