class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int checkodd = 0;
        for ( int i = 0; i<arr.length; i++){
            if (arr[i]%2!= 0){
                checkodd++;
if (checkodd == 3){
        return true;
    }
            }
            else {
                checkodd = 0;
            }
        }
    
    
return false;
    
  
    }}
    
