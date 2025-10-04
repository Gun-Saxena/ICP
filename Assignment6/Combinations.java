package ICP.Assignment6;

import java.util.*;
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        helper(1,n,k,new ArrayList<>(),res);
        return res;
    }
    void helper(int st,int n,int k,List<Integer> curr,List<List<Integer>> res) {
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=st;i<=n;i++){
            curr.add(i);   
            helper(i+1,n,k,curr,res);
            curr.remove(curr.size()-1); 
        }
    }
}