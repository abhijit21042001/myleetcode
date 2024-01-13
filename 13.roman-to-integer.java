/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanVal=new HashMap<>();
        romanVal.put('I', 1);
        romanVal.put('V', 5);
        romanVal.put('L', 50);
        romanVal.put('D', 500);
        romanVal.put('X', 10);
        romanVal.put('C', 100);
        romanVal.put('M', 1000);
        int sum=0;
        for(int i=0; i<s.length();i++){
            char currentChar = s.charAt(i);
            int val = romanVal.get(currentChar);
        
            if (i < s.length() - 1 && romanVal.get(s.charAt(i + 1)) > val) {
                sum = sum - val;
            } else {
                sum = sum + val;
            }

        }

        return sum;
    }
}
// @lc code=end

