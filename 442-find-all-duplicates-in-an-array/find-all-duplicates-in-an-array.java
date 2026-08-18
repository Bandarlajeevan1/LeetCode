class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       /* ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                l.add(nums[i]);
            }
        }
        return l;*/
        List<Integer> l= new ArrayList<Integer>();
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                l.add(Math.abs(nums[i]));
            }else{
                nums[index]=-nums[index];
            }
        }
        return l;
    }
}