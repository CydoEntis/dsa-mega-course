
import java.util.*;

/*
----------------------------------------------------------
💡 Example Problem — Two Sum
----------------------------------------------------------
Given an array of integers (nums) and a target value,
return the indices of the two numbers that add up to the target.
----------------------------------------------------------
 */
class TwoSum {

    // 🧩 Approach #1 — Brute Force
    public static int[] TwoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == complement) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // ⚙️ Approach #2 — Sorting + Two Pointers
    public static int[] TwoSumSorting(int[] nums, int target) {
        class Pair {

            int value, index;

            Pair(int v, int i) {
                value = v;
                index = i;
            }
        }

        Pair[] pairs = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new Pair(nums[i], i);
        }

        Arrays.sort(pairs, Comparator.comparingInt(p -> p.value));

        int left = 0;
        int right = pairs.length - 1;

        while (left < right) {
            int sum = pairs[left].value + pairs[right].value;
            if (sum == target) {
                return new int[]{pairs[left].index, pairs[right].index}; 
            }else if (sum < target) {
                left++; 
            }else {
                right--;
            }
        }

        return new int[0];
    }

    // ⚡ Approach #3 — HashMap (Optimal)
    public static int[] TwoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
