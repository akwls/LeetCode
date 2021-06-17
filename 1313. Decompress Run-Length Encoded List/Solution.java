class Solution {
    public int[] decompressRLElist(int[] nums) {
        int cnt = 0;
        for(int i=0; i<nums.length; i+=2) {
            cnt+=nums[i];
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i=0; i<nums.length; i+=2) {
            for(int j=0; j<nums[i]; j++) {
                answer[cnt] = nums[i+1];
                cnt++;
            }
        }
        return answer;
    }
}