package medianoftwosortedarrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int fs = 0;//first start
        int fe = nums1.length;//first end
        int ss = 0;//second start
        int se = nums2.length;//second end

        for (int i = 1; i < (total + 1) / 2; i++) {
            // if first nums is null
            if (fs == fe) {
                ss++;
            } else if (ss == se) {
                fs++;
            } else if (nums1[fs] > nums2[ss]) {
                ss++;
            } else {
                fs++;
            }
        }

        for (int j = 1; j < (total + 1) / 2; j++) {
            if (fs == fe) {
                se--;
            } else if (ss == se) {
                fe--;
            } else if (nums1[fe - 1] < nums2[se - 1]) {
                se--;
            } else {
                fe--;
            }
        }
        if (fe + se - fs - ss == 1) {
            if (fe - fs == 1) {
                return nums1[fs];
            } else {
                return nums2[ss];
            }
        } else {
            if (fe - fs == 2) {
                return (nums1[fs] + nums1[fs + 1]) / 2.0;
            } else if (se - ss == 2) {
                return (nums2[ss] + nums2[ss + 1]) / 2.0;
            } else {
                return (nums1[fs] + nums2[ss]) / 2.0;
            }
        }
    }
}
