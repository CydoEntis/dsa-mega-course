class TwoSum
{
  /*
----------------------------------------------------------
💡 Example Problem — Two Sum
----------------------------------------------------------
Given an array of integers (nums) and a target value,
return the indices of the two numbers that add up to the target.
----------------------------------------------------------
  */

  // 🧩 Approach #1 — Brute Force
  public static int[] TwoSumBruteForce(int[] nums, int target)
  {
    for (int i = 0; i < nums.Length; i++)
    {
      int complement = target - nums[i];
      for (int j = i + 1; j < nums.Length; j++)
      {
        if (nums[j] == complement)
          return new int[] { i, j };
      }
    }
    return new int[0];
  }

  // ⚙️ Approach #2 — Sorting + Two Pointers
  public static int[] TwoSumSorting(int[] nums, int target)
  {
    var pairs = nums.Select((num, idx) => new { num, idx }).ToArray();
    Array.Sort(pairs, (a, b) => a.num.CompareTo(b.num));

    int left = 0;
    int right = pairs.Length - 1;

    while (left < right)
    {
      int sum = pairs[left].num + pairs[right].num;
      if (sum == target)
        return new int[] { pairs[left].idx, pairs[right].idx };
      else if (sum < target)
        left++;
      else
        right--;
    }

    return new int[0];
  }

  // ⚡ Approach #3 — Dictionary (Optimal)
  public static int[] TwoSumHashMap(int[] nums, int target)
  {
    var dict = new Dictionary<int, int>();
    for (int i = 0; i < nums.Length; i++)
    {
      int complement = target - nums[i];
      if (dict.ContainsKey(complement))
        return new int[] { dict[complement], i };
      dict[nums[i]] = i;
    }
    return new int[0];
  }
}
