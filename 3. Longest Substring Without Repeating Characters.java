class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int len = 0;
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        while(right<n){
            if(hm.containsKey(s.charAt(right))){
           left = Math.max(hm.get(s.charAt(right))+1, left);
                
            }
            hm.put(s.charAt(right),right);
            len = Math.max(len,right-left +1);
            right++;
            
            
        }
        return len;
    }
}
