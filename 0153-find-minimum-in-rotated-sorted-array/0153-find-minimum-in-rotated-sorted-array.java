class Solution {
    public int findMin(int[] nums) {
        int check = 99999;
        for (int i = 0; i<nums.length; i++){
            if(nums[i]<check){
                check = nums[i];
            }
        }
        return check;
    }
}