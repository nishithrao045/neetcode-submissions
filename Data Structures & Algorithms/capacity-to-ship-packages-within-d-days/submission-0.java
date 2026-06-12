class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int w:weights){
            low=Math.max(w,low);
            high=w+high;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            int reqDays=1;
            int currWeight=0;
            for(int w:weights){
                if(currWeight+w>mid){
                    reqDays++;
                    currWeight=w;
                }
                else currWeight+=w;
            }
            if(reqDays<=days){
              high=mid;
            }
            else{
            low=mid+1;
            } 
            
        }return low;
    }
}