// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int count =0;
//         for(int i=0; i<nums.length; i++) {
//             for(int j = i+1; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
// SOULTION 
class Solution {
    public int numIdenticalPairs(int[] nums) {
       int []arr = new int[101];
       int ans = 0;
       for(int i=0;i<nums.length;i++){
        ans+=arr[nums[i]];
        arr[nums[i]]++;
       }
       return ans;
    }
}