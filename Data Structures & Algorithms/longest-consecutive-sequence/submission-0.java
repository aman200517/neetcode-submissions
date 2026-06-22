class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> numset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            numset.add(nums[i]);
        }
        int longestsub=1;
        for(int num:numset){
            if(numset.contains(num-1)){
                continue;
            }
            else{
                int currentnum=num;
                int currentsub=1;
                while(numset.contains(currentnum+1)){
                    currentnum++;
                    currentsub++;
                }
                longestsub=Math.max(longestsub,currentsub);
            }
        }
        return longestsub;
    }
}
