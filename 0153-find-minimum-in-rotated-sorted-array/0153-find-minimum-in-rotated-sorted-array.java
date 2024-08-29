class Solution {
    public int findMin(int[] nums) {
           int pivot = findpivot(nums);
int start = 0;
if(nums.length == 1){
    return nums[pivot];
}
else if(nums.length-1 == pivot){
        return nums[start];
    }
else{

    if(nums[pivot]<nums[pivot+1]){
        return nums[start];
    }
    else{
        return nums[pivot+1];
    }
    }}

public int findpivot(int[] nums){


    int start = 0;
    int end = nums.length-1;
    while (start <=end) {

        int mid = start + (end - start)/2;
        if(mid < end &&  nums[mid] > nums[mid +1]){
            return mid;
        }
        else if ( mid > start && nums[mid] < nums[mid-1]){
            return mid-1;
        }
        else if(nums[start]>= nums[mid]){
            end = mid -1;
        }
        else {
            start = mid +1;
        }
    }

    return start;
}
}