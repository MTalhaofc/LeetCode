class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        else{
        int start =0;
        int end = num;
        while(start < end){
            int mid=start+ (end-start)/2;
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid>num){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }}
        return false;
    }
}