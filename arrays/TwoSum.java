
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
----------------------------------------------------------
💡 Example Problem — LeetCode #1: Two Sum
----------------------------------------------------------
Given an array of integers (nums) and a target value,
return the indices of the two numbers that add up to the target.

Example:
nums = [15, 7, 2, 11]
target = 9
Result: [1, 2] → because nums[1] + nums[2] = 7 + 2 = 9
----------------------------------------------------------
 */
// --------------------------------------------------------
// 🧩 Approach #1 — Brute Force
// --------------------------------------------------------
/*
Steps:
1. Loop through each element (i).
2. For each element, loop again (j) to find another number
   that adds up to the target.
3. If found, return [i, j].

Example:
nums = [15, 7, 2, 11], target = 9

- Start at 15 → too large, skip.
- Next is 7 → 9 - 7 = 2 → found at index 2.
✅ Answer = [1, 2]

❌ Time Complexity: O(n²)
   (You might scan the entire array twice)
✅ Space Complexity: O(1)
 */
class TwoSum {

    public int[] BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == newTarget) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // --------------------------------------------------------
    // ⚙️ Approach #2 — Sorting + Two Pointers
    // --------------------------------------------------------
    /*
    Steps:
    1. Pair each number with its original index.
    2. Sort the array by value.
    3. Use two pointers:
       - Move `left` rightward if sum < target.
       - Move `right` leftward if sum > target.
    4. When sum == target, return both original indices.

    Example:
    nums = [15, 7, 2, 11] → sort → [2, 7, 11, 15]
    left = 0 (2), right = 3 (15) → 17 > 9 → move right--
    left = 0 (2), right = 1 (7) → 2 + 7 = 9 ✅

    ✅ Time Complexity: O(n log n)
    ✅ Space Complexity: O(n)
     */
    public int[] BetterApproach(int[] nums, int target) {
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        int left = 0;
        int right = pairs.length - 1;

        while (left < right) {
            int sum = pairs[left][0] + pairs[right][0];
            if (sum == target) {
                return new int[]{pairs[left][1], pairs[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }

    // --------------------------------------------------------
    // ⚡ Approach #3 — HashMap (Optimal)
    // --------------------------------------------------------
    /*
    Steps:
    1. Create a HashMap to store numbers and their indices.
    2. For each number:
       - Compute complement = target - current number.
       - If complement exists in the map → return indices.
       - Otherwise, add current number to the map.

    Example:
    nums = [1, 7, 3, 2], target = 9

    Iteration:
    - 1 → store {1:0}
    - 7 → store {7:1}
    - 3 → store {3:2}
    - 2 → complement = 7 → found! ✅ return [3,1]

    ✅ Time Complexity: O(n)
    ✅ Space Complexity: O(n)
     */
    public int[] BestApproach(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
