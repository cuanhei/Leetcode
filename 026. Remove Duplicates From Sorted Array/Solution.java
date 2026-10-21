class Solution {
    public int removeDuplicates(int[] nums) {
        int currentValue = nums[0];
        int nextIndex = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != currentValue){
                nums[nextIndex] = nums[i];
                currentValue = nums[i]; 
                count++;
                nextIndex++;
            }
        }
        return count;
    }
}