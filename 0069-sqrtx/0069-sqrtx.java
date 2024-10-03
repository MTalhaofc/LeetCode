class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;

if( x == 0 || x ==1){
    return x;

}

else{

    while(start <= end){
        int mid = start + (end- start)/2;
        if(mid * mid == x){
            return mid ;
        }
        else if((long) mid * mid >(long) x){
            end = mid -1;
        }
        else {
            start = mid + 1;
        }
    }
    return  Math.round(end);

    }}
}