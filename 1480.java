class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length ==0 ){
            return nums;
        }
        int[] arr = new int[nums.length];
        int runSum =0;
        for(int i =0;i<nums.length;i++){
            runSum+=nums[i];
            arr[i] = runSum;
        }
        return arr;
    }
}
