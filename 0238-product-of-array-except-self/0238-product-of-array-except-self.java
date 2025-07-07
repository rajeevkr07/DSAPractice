class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answer = new int[nums.length];

        Arrays.fill(answer, 1);
        int pre = 1, post = 1;

        for(int i =0; i<nums.length; i++){
            answer[i]= pre;
            pre = nums[i]*pre;
        }

        for(int i = nums.length-1; i>=0; i--){
            answer[i] = answer[i]*post;
            post = nums[i]*post;
        }
        return answer;
    }
}