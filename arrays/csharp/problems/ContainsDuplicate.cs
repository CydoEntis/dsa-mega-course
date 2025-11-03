class ContainsDuplicate
{
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

  // 🧩 Approach #1 — Brute Force
  public static bool ContainsDuplicateBruteForce(int[] nums)
  {
    for (int i = 0; i < nums.Length; i++)
    {
      for (int j = i + 1; j < nums.Length; j++)
      {
        if (nums[i] == nums[j]) return true;
      }
    }
    return false;
  }

  // ⚙️ Approach #2 — Sort & Neighbor Check
  public static bool ContainsDuplicateSorting(int[] nums)
  {
    Array.Sort(nums);
    for (int i = 0; i < nums.Length - 1; i++)
    {
      if (nums[i] == nums[i + 1]) return true;
    }
    return false;
  }

  // ⚡ Approach #3 — HashSet
  public static bool ContainsDuplicateHashSet(int[] nums)
  {
    var seen = new HashSet<int>();
    foreach (int num in nums)
    {
      if (!seen.Add(num)) return true;
    }
    return false;
  }

  // ⚡ Approach #4 — Concise with LINQ (optional)
  public static bool ContainsDuplicateBest(int[] nums)
  {
    var seen = new HashSet<int>();
    return nums.Any(num => !seen.Add(num));
  }
}