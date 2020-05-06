class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int lastposition = len-1;
        for(int i= len-1;i>=0;i--){
            if(i+ nums[i] >= lastposition){
                lastposition =i;
            }
        }
        return lastposition == 0;
    }
}
