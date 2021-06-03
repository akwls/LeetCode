class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[n*2];
        int cnt = 0;
        for(int i=0; i<n*2; i+=2, cnt++) {
            answer[i] = nums[cnt];
            answer[i+1] = nums[cnt+n];
        }
        return answer;
    }
}