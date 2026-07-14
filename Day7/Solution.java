package Day7;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged=new int[nums1.length+nums2.length];
        int first=0;
        int second=0;
        int mergeInd=0;
        while(first<nums1.length && second<nums2.length){
            if(nums1[first]>nums2[second]){
                merged[mergeInd]=nums2[second];
                second++;
                mergeInd++;
            }
            else if(nums1[first]<=nums2[second]){
                merged[mergeInd]=nums1[first];
                first++;
                mergeInd++;
            }
        }
        while(first<nums1.length){
            merged[mergeInd]=nums1[first];
            first++;
            mergeInd++;
        }
        while(second<nums2.length){
            merged[mergeInd]=nums2[second];
            second++;
            mergeInd++;
        }

        int mid=(0+merged.length)/2;
        if(merged.length%2!=0){
            return merged[mid];
        }
        else{
            return (merged[mid-1] + merged[mid]) / 2.0;
        }
    }
} 
