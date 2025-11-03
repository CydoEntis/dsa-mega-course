# C#

Arrays are ordered collections of elements. They provide fast access by index and are widely used in programming. Below is a breakdown of common operations, time/space complexities, and examples.

**Creating Arrays**  
There are multiple ways to create arrays in C#:

```csharp
// Empty array
int[] arr1 = new int[0]; // Time: O(1) | Space: O(1)

// Array with a fixed length
int[] arr2 = new int[10]; // Creates an array of length 10, initialized to 0

// Array with initial values
int[] arr3 = {1, 2, 3, 4, 5};

Console.WriteLine(string.Join(", ", arr1));
Console.WriteLine(string.Join(", ", arr2));
Console.WriteLine(string.Join(", ", arr3));
```

> Explanation:
>
> - Arrays in C# have a fixed size.
> - {} syntax initializes arrays with specific values.
> - string.Join() prints array elements.

Inserting Elements

> Note: C# arrays are fixed size. Use List<T> for dynamic insertion.

```csharp
using System;
using System.Collections.Generic;

List<int> arr = new List<int> {1, 2, 3};
arr.Add(4); // Push equivalent
Console.WriteLine(string.Join(", ", arr));

arr.Insert(0, 0); // Unshift equivalent
Console.WriteLine(string.Join(", ", arr));

arr.Insert(2, 99); // Splice equivalent
Console.WriteLine(string.Join(", ", arr));
Accessing Elements
csharp
Copy code
int[] numbers = {10, 20, 30, 40};
int value = numbers[2]; // 30
Console.WriteLine(value);
```

> Explanation:
>
> Arrays in C# allow O(1) random access by index.

Traversing Arrays
For Loop

```csharp
for (int i = 0; i < numbers.Length; i++) {
  Console.WriteLine(numbers[i]);
}
```

Foreach Loop

```csharp
foreach (int num in numbers) {
  Console.WriteLine(num);
}
```

Foreach for List

```csharp
foreach (int num in arr) {
    Console.WriteLine(num);
}
```

| Operation                | Time Complexity | Space Complexity | Notes              |
| ------------------------ | --------------- | ---------------- | ------------------ |
| Create empty array       | O(1)            | O(1)             | Minimal overhead   |
| Create array with values | O(n)            | O(n)             | Copies elements    |
| Access by index          | O(1)            | O(1)             | Random access      |
| Add (end)                | O(1) amortized  | O(1)             | List<T> append     |
| Add (start)              | O(n)            | O(1)             | Shifts elements    |
| Add (middle)             | O(n)            | O(1)             | Shifts elements    |
| Traverse                 | O(n)            | O(1)             | For, foreach loops |
