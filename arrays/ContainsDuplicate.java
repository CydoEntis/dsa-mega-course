
import java.util.Arrays;
import java.util.HashSet;

/*
----------------------------------------------------------
🧠 Contains Duplicate Notes
----------------------------------------------------------
Problem:
- Given an integer array nums, return true if any value appears at least twice.
- Return false if all elements are distinct.

Examples:
- nums = [1, 4, 3, 5, 4] → returns true (4 appears twice)
- nums = [1, 2, 3, 4, 5] → returns false (all distinct)
----------------------------------------------------------
 */
// --------------------------------------------------------
// 🧩 Approach #1 — Brute Force
// --------------------------------------------------------
/*
Steps:
1. Loop through each element (i).
2. For each element, loop again (j) to check every possible pair.
3. If nums[i] == nums[j] → duplicate found, return true.

Example:
nums = [1, 4, 3, 5, 4]

- Compare 1 with 4, 3, 5, 4 → no match
- Compare 4 with 3, 5, 4 → match found at index 4 ✅

❌ Time Complexity: O(n²)
✅ Space Complexity: O(1)
 */
class ContainsDuplicate {

    public boolean BruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // --------------------------------------------------------
    // ⚙️ Approach #2 — Sort & Neighbor Check
    // --------------------------------------------------------
    /*
    Steps:
    1. Sort the array.
    2. Loop through the array, compare each element with its neighbor.
    3. If nums[i] == nums[i+1] → duplicate found.

Example:
nums = [1, 4, 3, 5, 4]
After sort → [1, 3, 4, 4, 5]
Check neighbors:
- 1-3 → ok
- 3-4 → ok
- 4-4 → duplicate found ✅

✅ Time Complexity: O(n log n) (sorting)
✅ Space Complexity: O(1) if sorting in-place
     */
    public boolean BetterApproach(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // --------------------------------------------------------
    // ⚡ Approach #3 — HashSet (Clear)
    // --------------------------------------------------------
    /*
    Steps:
    1. Initialize an empty HashSet.
    2. Loop through nums:
       - If the number exists in the set → duplicate found.
       - Otherwise, add the number to the set.

Example:
nums = [3, 1, 4, 1, 5]

Iteration:
- seenNumbers = {}
- num=3 → add → {3}
- num=1 → add → {1, 3}
- num=4 → add → {1, 3, 4}
- num=1 → already in set → return true ✅

✅ Time Complexity: O(n) average
✅ Space Complexity: O(n)
     */
    public boolean EvenBetterApproach(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }

    // --------------------------------------------------------
    // ⚡ Approach #4 — HashSet (Concise)
    // --------------------------------------------------------
    /*
    Steps:
    1. Initialize an empty HashSet.
    2. Loop through nums:
       - Try to add num to the set.
       - If add() returns false → duplicate found.

Example:
nums = [3, 1, 4, 1, 5]

Iteration:
- seenNumbers = {}
- add(3) → true → {3}
- add(1) → true → {1,3}
- add(4) → true → {1,3,4}
- add(1) → false → duplicate found ✅

✅ Time Complexity: O(n) average
✅ Space Complexity: O(n)
     */
    public boolean BestApproach(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for (int num : nums) {
            if (!seenNumbers.add(num)) { // returns false if duplicate
                return true;
            }
        }
        return false;
    }
}
