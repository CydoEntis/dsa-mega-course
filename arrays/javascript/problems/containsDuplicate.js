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
function containsDuplicateBruteForce(nums) {
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] === nums[j]) return true;
    }
  }
  return false;
}

// --------------------------------------------------------
// ⚙️ Approach #2 — Sort & Neighbor Check
// --------------------------------------------------------
function containsDuplicateSorting(nums) {
  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length - 1; i++) {
    if (nums[i] === nums[i + 1]) return true;
  }
  return false;
}

// --------------------------------------------------------
// ⚡ Approach #3 — Hash Set
// --------------------------------------------------------
function containsDuplicateHashSet(nums) {
  const seen = new Set();
  for (const num of nums) {
    if (seen.has(num)) return true;
    seen.add(num);
  }
  return false;
}

// Concise approach
function containsDuplicateBest(nums) {
  const seen = new Set();
  return nums.some((num) => !seen.add(num));
}
