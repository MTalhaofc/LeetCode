class Solution {
    public boolean isPerfectSquare(int num) {
       long ans = mysqrt(num);
       if ( ans * ans == num){
        return true;
       }
       else{
         return false;
       }



    }
    
    public long mysqrt(int num){

        long start = 0;
        long end = num;
        while(start <=end){
            long mid = start + (end - start)/2;
            if( mid * mid == num){
                return mid;
            }
            else if( mid* mid > num){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }


        }
    
return Math.round(end);
    }
}