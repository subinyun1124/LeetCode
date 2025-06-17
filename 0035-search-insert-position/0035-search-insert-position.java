class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        if(nums[0] > target) {
            return 0;
        }else if(nums[nums.length-1] < target) {
            return index = nums.length;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target){
                index = i;
                break;
            }
        }

        return index;
    }
}