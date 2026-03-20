/* This is solved from leet this is to square the given arry and sort after squaring */
class leet10 {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length ; i++){
            nums[i] *=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}