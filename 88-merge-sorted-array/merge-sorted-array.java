class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //3 pointers : i = nums1 ka last element, j = nums2 ka last, k = num1 ka end
        int i = m-1; // nums1 ka last element
        int j = n-1; // nums2 ka last element
        int k = m+n-1; // nums1 ka bilkul end jaha fill krna hai

        // Dono array me element hai tab tk compare karo
        while ( i>= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; //bada wala pichei rakho
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // agar nums2 me element bache hai to copy kar do
        //nums1 ke bache hue element already apni jgah pe hai
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}