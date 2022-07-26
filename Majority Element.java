class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int x = n/2;
        for(int i = 0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else
            {
                int count = hm.get(nums[i]);
                hm.put(nums[i],count+1);
            }
        }
        for(Map.Entry m : hm.entrySet()){
            int temp = (Integer)m.getValue();
            if(temp>x){
                return (Integer)m.getKey();
            }
        }
        return 0;
    }
}
