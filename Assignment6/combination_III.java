package ICP.Assignment6;

import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    void helper(int[] candidates,int target,int st,List<Integer> co,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(co));
            return;
        }
        for(int i=st;i<candidates.length;i++){
            if(i>st && candidates[i]==candidates[i-1]) continue;
            if (candidates[i]>target) break; 
            co.add(candidates[i]);
            helper(candidates,target-candidates[i],i+1,co,res);
            co.remove(co.size()-1);
        }
    }
}
