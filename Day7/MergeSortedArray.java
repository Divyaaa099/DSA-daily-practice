class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        int first=0;
        int second=0;
        int[] merged=new int[m+n];

        while(first<m && second<n){
            if(nums1[first]>nums2[second]){
                merged[k]=nums2[second];
                second++;
                k++;
            }
            else{
                merged[k]=nums1[first];
                first++;
                k++;
            }
        }
        while(first<m){
            merged[k]=nums1[first];
            first++;
            k++;
        }
        while(second<n){
            merged[k]=nums2[second];
            second++;
            k++;
        }
        for(int i = 0; i < m + n; i++){
            nums1[i] = merged[i];
        }
    }
}