/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        int[] mergArray=new int[nums1.length+nums2.length];
        for (int i=0;i<=nums1.length;i++){
            nums1[i]=mergArray[i];
        }
        for(int j=0;j<nums2.length;j++){
            int k=mergArray.length-1;
            nums2[j]=mergArray[k];   
        }
        for (int l=0;l<=mergArray.length;l++){
            if(mergArray[l]>=mergArray[l+1]){
                int m=mergArray[l];
                mergArray[l]=mergArray[l+1];
                mergArray[l+1]=m;
            }
            int n=mergArray.length;
            if(n%2==0){
               double M= ((n-1)+n)/2;
            }else{double M=n%2;}
        }
        return 0;
    }
}
// @lc code=end

