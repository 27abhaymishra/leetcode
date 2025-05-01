class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);

        Set<Integer> set2 = new HashSet<>();
        for (int n : nums2) set2.add(n);

        Set<Integer> set3 = new HashSet<>();
        for (int n : nums3) set3.add(n);

        Set<Integer> result = new HashSet<>();

        // Check nums1 against nums2 and nums3
        for (int num : set1) {
            if (set2.contains(num) || set3.contains(num)) {
                result.add(num);
            }
        }

        // Check nums2 against nums3
        for (int num : set2) {
            if (set3.contains(num)) {
                result.add(num);
            }
        }

        // Convert result to list
        return new ArrayList<>(result);
    }
}