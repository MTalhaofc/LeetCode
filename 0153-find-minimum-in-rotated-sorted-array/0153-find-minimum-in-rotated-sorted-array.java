class Solution {
    public int findMin(int[] nums) {
        int target = 99;
     for ( int i = 0; i<nums.length; i++){
        if( target > nums[i]){
            target = nums[i];
        }
     }   
     return target;
    }
}