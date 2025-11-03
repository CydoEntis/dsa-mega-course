
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
----------------------------------------------------------
🧠 Contains Duplicate
----------------------------------------------------------
Problem:
- Given an integer array nums, return true if any value appears at least twice.
- Return false if all elements are distinct.
----------------------------------------------------------
 */
class ContainsDuplicate {

    // 🧩 Approach #1 — Brute Force
    public static boolean ContainsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // ⚙️ Approach #2 — Sort & Neighbor Check
    public static boolean ContainsDuplicateSorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // ⚡ Approach #3 — HashSet
    public static boolean ContainsDuplicateHashSet(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true; // add() returns false if already present

            }
        }
        return false;
    }

    // ⚡ Approach #4 — Concise with Streams (optional)
    public static boolean ContainsDuplicateBest(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        return Arrays.stream(nums).anyMatch(n -> !seen.add(n));
    }
}
