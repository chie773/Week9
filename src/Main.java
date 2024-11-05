public class Main {
    public static void main(String[] args) {
        Solution ans = new Solution();

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {0};
        int[] nums3 = {5};
        int[] nums4 = {0, -1, 9, -3, -2, 2, 1, 5};
        int[] nums5 = {10, 20, 30, 40, 50};
        int[] nums6 = {1, 9, 3, 10, 4, 20, 2};
        int[] nums7 = {1, 3, 5, 2, 4, 6, 7, 9, 8, 12, 13, 10, 11};


        System.out.println(ans.longestConsecutive(nums1));
        System.out.println(ans.longestConsecutive(nums2));
        System.out.println(ans.longestConsecutive(nums3));
        System.out.println(ans.longestConsecutive(nums4));
        System.out.println(ans.longestConsecutive(nums5));
        System.out.println(ans.longestConsecutive(nums6));
        System.out.println(ans.longestConsecutive(nums7));
    }
}