/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int sum=0;
        for (int i=val; i<nums.length;i=i+2){
                sum=sum+i;
        }
        return sum;
    }
}
// @lc code=end

