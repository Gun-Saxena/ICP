//-- > brute force
// class Solution {
//     public boolean isPerfectSquare(int num) {
//         for(long i=1;i<=num;i++){
//             if(i*i==num) return true;
//         }
//         return false;
//     }
// }
//-- > optimal approach
class Solution {
    public boolean isPerfectSquare(int num) {
        long start=1;
        long end=num;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==num) return true;
            else if(mid*mid<num){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
