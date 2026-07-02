package Day2;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=0;i<n;i++){
            nums1[m+k]=nums2[i];
            k++;
        }
        for (int pass = 0; pass < nums1.length - 1; pass++) {
            for (int i = 0; i < nums1.length-1; i++) {
                if (nums1[i] > nums1[i + 1]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                }
            }
        }
    }
}