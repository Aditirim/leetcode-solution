//4120. Count Dominant Elements
class Solution {
    public int countDominantElements(int[] nums) {
        int c=0;
        if(nums.length==1)
        return 1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]>=nums[i+1])
                c++;
            }
            else if(i==nums.length-1){
                if(nums[i]>=nums[i-1])
                c++;
            }
            else{
                if((2*nums[i])>=(nums[i-1]+nums[i+1]))
                c++;
            }
        }
        return c;
    }
}