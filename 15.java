/*Input:  [1,2,3,4]
Output: [24,12,8,6]
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] retArr = new int[nums.length];
        
        for(int j=0;j<nums.length;j++){
        int product = 1;
        
        for(int i =0 ;i<nums.length;i++){
            if(i!=j){
                product = product*nums[i];
            }
                
            }
            retArr[j] = product;                    
        }
        
        return retArr;
    }
}
