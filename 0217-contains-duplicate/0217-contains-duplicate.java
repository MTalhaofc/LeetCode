class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
    //     int count = 0;
    //     for(int i = 1; i < nums.length; i++){
    //         for(int j = i; j<nums.length; j++){
    //         if(nums[i-1]==nums[j]){
    //             count++;
    //         }
    //     }}
    // if(count >= 1){
    //     return true;
    // }else{
    // return false;
    // }
     for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
        }
        return false;
    }
}