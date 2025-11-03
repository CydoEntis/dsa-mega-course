## Java Array Notes

Arrays are ordered collections of elements. They provide fast access by index and are widely used in programming. Below is a breakdown of common operations, time/space complexities, and examples.

**Creating Arrays**  
There are multiple ways to create arrays in Java:

```java
// Empty array (size must be defined)
int[] arr1 = new int[0]; // Time: O(1) | Space: O(1)

// Array with a fixed length
int[] arr2 = new int[10]; // Creates an array of length 10, initialized to 0

// Array with initial values
int[] arr3 = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(arr1));
System.out.println(Arrays.toString(arr2));
System.out.println(Arrays.toString(arr3));
```

> Explanation:
>
> - Arrays in Java must have a defined size when created.
> - {} syntax initializes the array with specific values.
> - Arrays.toString() is used to print arrays.

**Inserting Elements**

> Note: Java arrays are fixed size, so inserting elements requires using a new array or using an ArrayList for dynamic behavior.

Using ArrayList for dynamic insertion:

```java
import java.util.ArrayList;

ArrayList<Integer> arr = new ArrayList<>();
arr.add(1);
arr.add(2);
arr.add(3);
arr.add(4); // Push equivalent
System.out.println(arr);

arr.add(0, 0); // Unshift equivalent (insert at start)
System.out.println(arr);

arr.add(2, 99); // Splice equivalent (insert at index 2)
System.out.println(arr);
```

> Explanation:
>
> ArrayList allows dynamic resizing and provides add(index, value) for insertion.

Accessing Elements

```java
int[] numbers = {10, 20, 30, 40};
int value = numbers[2]; // 30
System.out.println(value);
```

> Explanation:
>
> Arrays in Java allow O(1) random access by index.

Traversing Arrays
For Loop

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

Enhanced For Loop

```java
for (int num : numbers) {
    System.out.println(num);
}
```

For ArrayList

```java
for (int num : arr) {
    System.out.println(num);
}
```

> Explanation:
>
> Use traversal to process each element. All loops are O(n) in time complexity.

| Operation                | Time Complexity            | Space Complexity | Notes                   |
| ------------------------ | -------------------------- | ---------------- | ----------------------- |
| Create empty array       | O(1)                       | O(1)             | Minimal overhead        |
| Create array with values | O(n)                       | O(n)             | Copies elements         |
| Access by index          | O(1)                       | O(1)             | Random access           |
| Add (end)                | O(1) (ArrayList amortized) | O(1)             | Dynamic array append    |
| Add (start)              | O(n)                       | O(1)             | Shifts elements         |
| Add (middle)             | O(n)                       | O(1)             | Shifts elements         |
| Traverse                 | O(n)                       | O(1)             | For loops, enhanced for |
