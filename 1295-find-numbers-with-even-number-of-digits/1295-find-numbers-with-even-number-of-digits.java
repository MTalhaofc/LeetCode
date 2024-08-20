class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
        if(even(nums[i])){
            count++;
        }
        
        }
    return count;
    }
     int digits(int num){
if(num<0){
    num = num *-1;
}
    return (int)(Math.log10(num)+1);
}

    boolean even(int num){
int numofdigits = digits(num);
if (numofdigits % 2 == 0){
return true;

}

    return false;
}

}