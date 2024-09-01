class Solution {
    public boolean search(int[] nums, int target) {
        // Handle the edge case where the array has only one element
        if (nums.length == 1) {
            return nums[0] == target;
        }

        int pivot = findpivot(nums);

        if (pivot != -1 && nums[pivot] == target) {
            return true;
        } else if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        } else if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot);
        } else {
            return binarysearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    public boolean binarysearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public int findpivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check boundaries before accessing mid-1 and mid+1
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // Skip duplicates and move start and end closer
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && nums[end - 1] > nums[end]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
