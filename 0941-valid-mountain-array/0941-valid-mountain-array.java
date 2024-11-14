class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=arr[0];
        int maxI=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxI=i;
            }
        }
        if(maxI==0||maxI==arr.length-1){
            return false;
        }
        int start=arr[0];
        for(int j=1;j<=maxI;j++){
            if(!(arr[j]>start))
                return false;
            else
                start=arr[j];
            
        }
        for(int k=maxI+1;k<arr.length;k++){
            if(!(arr[k]<max))
                return false;
            else
                max=arr[k];
        }
       return true;
    }
}