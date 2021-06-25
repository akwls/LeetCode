class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int n;
        for(int i=0; i<nums.length-1; i++) {
            n = 0;
            for(int j = i+1; j<nums.length; j++) {
                n = nums[i] + nums[j];
                if(n == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}