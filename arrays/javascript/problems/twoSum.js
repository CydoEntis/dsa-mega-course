/*
----------------------------------------------------------
💡 Example Problem — Two Sum
----------------------------------------------------------
Given an array of integers (nums) and a target value,
return the indices of the two numbers that add up to the target.
----------------------------------------------------------
*/

// --------------------------------------------------------
// 🧩 Approach #1 — Brute Force
// --------------------------------------------------------
function twoSumBruteForce(nums, target) {
  for (let i = 0; i < nums.length; i++) {
    const complement = target - nums[i];
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[j] === complement) {
        return [i, j];
      }
    }
  }
  return [];
}

// --------------------------------------------------------
// ⚙️ Approach #2 — Sorting + Two Pointers
// --------------------------------------------------------
function twoSumSorting(nums, target) {
  // Store original indices
  const pairs = nums.map((num, idx) => [num, idx]);
  pairs.sort((a, b) => a[0] - b[0]);

  let left = 0;
  let right = pairs.length - 1;

  while (left < right) {
    const sum = pairs[left][0] + pairs[right][0];
    if (sum === target) {
      return [pairs[left][1], pairs[right][1]];
    } else if (sum < target) {
      left++;
    } else {
      right--;
    }
  }
  return [];
}

// --------------------------------------------------------
// ⚡ Approach #3 — Hash Map (Optimal)
// --------------------------------------------------------
function twoSumHashMap(nums, target) {
  const map = new Map();
  for (let i = 0; i < nums.length; i++) {
    const complement = target - nums[i];
    if (map.has(complement)) {
      return [map.get(complement), i];
    }
    map.set(nums[i], i);
  }
  return [];
}
