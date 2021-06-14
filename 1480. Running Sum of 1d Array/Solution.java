class Solution {
    public int[] runningSum(int[] nums) {
        int n = 0;
        int[] answer = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            n += nums[i];
            answer[i] = n;
        }
        return answer;
    }
}