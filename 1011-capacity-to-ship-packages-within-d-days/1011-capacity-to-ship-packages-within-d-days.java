class Solution {
    public int shipWithinDays(int[] nums, int days) {
    int min = 0;
    int max = 0;
    for(int i =0; i<nums.length; i++){
        if(nums[i]>min){
            min = nums[i];
        }
        max+=nums[i];
    }
    
    while(min <max){
        int edays = 1;
    int sum = 0;
        int mid = min + (max-min)/2;
        for(int i = 0; i<nums.length; i++){
        if(sum  + nums[i] > mid){
            edays++;
            sum = 0;
        }
        sum+=nums[i];
        }
    if(edays > days){
        min = mid+1;
    }
    else{
        max = mid;
    }
    }
   
   
   return min;
   
    }
    }