class Solution {
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        int answer;
        while(n>0) {
            mul *= n%10;
            sum += n%10;
            n /= 10;
        }
        answer = mul - sum;
        return answer;
    }
}