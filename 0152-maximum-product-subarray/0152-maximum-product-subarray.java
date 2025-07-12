class Solution {
    public int maxProduct(int[] nums) {
        // Dp is used in sol and using two pointers min and max
        // edge cases is array is empty or not 
        if(nums.length==0){
           return 0;
        }
        int min = nums[0];
        int max = nums[0];
        int result = max; // Ass we need max result

        for (int i= 1; i<nums.length; i++){
            int cur = nums[i]; // take cur variable  and put nums[i] into it 

             // checking minimun and maximum product with each from array nums
            int  temp = Math.max(cur, Math.max(max*cur, min*cur));
            min = Math.min(cur, Math.min(min*cur, max*cur));
             max = temp;

            result = Math.max(max, result); // finally checking maxium number with max and result 
        }
        return result;
    }
}