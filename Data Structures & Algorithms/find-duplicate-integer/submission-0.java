class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> hs=new HashSet<>();
       int dupli=0;
       for(int n:nums){
        if(hs.contains(n)){
            dupli=n;
        }
        else
         hs.add(n);
       } 
       return dupli;
    }
}
