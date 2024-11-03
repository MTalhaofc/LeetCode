class Solution {
    public double myPow(double x, int n) {
        double ans =1;
        if(n>0){
        for(int i =0 ; i<n;i++){
            ans = ans*x;
        
         } }
         else if(n<0){
            n = n*-1;
 for(int i =0 ; i<n;i++){
            ans = ans/x;
        
         } 
            
         }
         if(n==0){
            return 1;
         }
         if (n==-2147483648){
            return  0.00000;
         }
    return ans;
    }
}