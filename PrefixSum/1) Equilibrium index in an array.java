
// https://leetcode.com/problems/find-pivot-index/
class Solution {
    public int pivotIndex(int[] nums) {
        
        int size=nums.length;
        int totSum=0;
        int prefixSum=nums[0];
        
        for(int i=0;i<size; i++) {
            totSum+=nums[i];
        }
        if(totSum-prefixSum==0) return 0;
        for(int i=1; i<size-1; i++) {
            prefixSum+=nums[i];
            if((prefixSum-nums[i])==(totSum-prefixSum)) {
                return i;
            }
        }
        if(prefixSum==0) return size-1;
        return -1;
        
    }
}
