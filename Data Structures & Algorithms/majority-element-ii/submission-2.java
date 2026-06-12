class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0; int count2=0; int can1=0; int can2=0;
        for(int num:nums){
            if(can1==num){count1++;}
            else if(can2==num){ count2++;}
            else if(count1==0) {can1=num; count1=1;}
            else if(count2==0) {can2=num;count2=1;}
            else {count1--; count2--;}
        }
        count1=0; count2=0;
        for(int num:nums){
            if(can1==num)count1++;
            else if(can2==num)count2++;
        }
        List<Integer> res=new ArrayList<>();
        if(count1>nums.length/3) res.add(can1);
        if(count2>nums.length/3) res.add(can2); return res;
    }
}