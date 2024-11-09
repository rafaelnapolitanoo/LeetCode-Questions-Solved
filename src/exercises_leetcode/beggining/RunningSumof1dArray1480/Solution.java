package exercises_leetcode.beggining.RunningSumof1dArray1480;

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i =1 ; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
