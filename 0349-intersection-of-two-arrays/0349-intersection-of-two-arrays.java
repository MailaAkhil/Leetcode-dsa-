import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add nums1 elements to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Find common elements
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // Convert result Set to int[]
        int[] answer = new int[result.size()];
        int i = 0;

        for (int num : result) {
            answer[i++] = num;
        }

        return answer;
    }
}