class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long maxsum = 0;
        int l = 0;
        long ws = 0;
        for (int r = 0; r < nums.length; r++) {
            ws += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            if (r - l + 1 > k) {
                int val=nums[l];
                ws -= val;
                map.put(val,map.get(val)-1);
                if (map.get(val) == 0) {
                    map.remove(val);

                }
                l++;
            }
            if (r - l + 1 == k && map.size() == k) {
                maxsum = Math.max(maxsum, ws);
            }

        }

        return maxsum;
    }
}