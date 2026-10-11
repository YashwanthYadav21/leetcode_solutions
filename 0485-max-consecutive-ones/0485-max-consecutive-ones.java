class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int n=nums.length;
        int maxN=0;
        for(int i=0;i < n;i++){
            if (nums[i]==0){
                count = 0;
            }else{
            count++;
            }
            maxN =Math.max(maxN ,count);
        }
    return maxN;
}}