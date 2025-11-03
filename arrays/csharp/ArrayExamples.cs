// Creating arrays
int[] arr1 = new int[0]; // Empty array - fixed size, O(1)
int[] arr2 = new int[10]; // Predefined size, default elements 0
int[] arr3 = { 1, 2, 3, 4, 5 }; // Initialized with values

Console.WriteLine(string.Join(", ", arr1));
Console.WriteLine(string.Join(", ", arr2));
Console.WriteLine(string.Join(", ", arr3));

// Using List<T> for dynamic operations
List<int> list = new List<int> { 1, 2, 3, 4 };

list.Add(5); // Add to end - O(1) amortized
list.Add(6);
Console.WriteLine(string.Join(", ", list));

list.Insert(0, 12); // Insert at start - O(n) due to shifting elements
Console.WriteLine(string.Join(", ", list));

list.Insert(2, 5); // Insert at arbitrary index - O(n)
Console.WriteLine(string.Join(", ", list));

// Accessing elements
int[] accessArr = { 10, 20, 30, 40 };
int value = accessArr[2]; // O(1)
Console.WriteLine(value);

// Traversing arrays
for (int i = 0; i < accessArr.Length; i++)
{ // O(n)
  Console.WriteLine(accessArr[i]);
}

foreach (int num in accessArr)
{ // O(n)
  Console.WriteLine(num);
}

// Traversing List
foreach (int num in list)
{ // O(n)
  Console.WriteLine(num);
}

