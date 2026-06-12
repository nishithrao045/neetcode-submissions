class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[]  bucket=new List[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            int frequency=map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }   
        int [] result=new int[k];
        int ind=0;
        for(int i=bucket.length-1;i>=0 && ind<k;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    result[ind++]=num;
                    if(ind==k) break;
                }
            }
        } return result;
}}
