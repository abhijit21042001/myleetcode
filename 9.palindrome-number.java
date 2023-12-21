/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String y= Integer.toString(x);

        StringBuilder rev=new StringBuilder(y).reverse();
        if(rev.toString().equals(y)){
            return true;
        } else{
        return false;
    }

    }
}
// @lc code=end

