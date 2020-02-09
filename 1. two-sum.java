class Solution { 
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) return new int[2];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int add2 = target - nums[i];
            if (map.containsKey(add2)){
                if (map.get(add2) != i) {
                    return new int[]{ i, map.get(add2)};
                }
            }
        }
        return new int[2];
    }
}
