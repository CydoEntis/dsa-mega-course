## JavaScript Array Notes

Arrays are ordered collections of elements. They provide fast access by index and are widely used in programming. Below is a breakdown of common operations, time/space complexities, and examples.

**Creating Arrays**
There are multiple ways to create arrays in JavaScript:

```js
// Empty array
const arr1 = []; // Time: O(1) | Space: O(1)

// Array with a fixed length
const arr2 = new Array(10); // Creates an array of length 10 with empty slots

// Array with initial values
const arr3 = [1, 2, 3, 4, 5];

console.log(arr1);
console.log(arr2);
console.log(arr3);
```

> Explanation:
>
> - [] is the simplest way to create an empty array.
> - new Array(size) creates an array with a predefined length but does not initialize the elements.
> - [value1, value2, ...] initializes the array with specific elements.

### Inserting Elements

**Push** - Adds an element to the end of the array.

```js
const arr = [1, 2, 3];
arr.push(4); // [1, 2, 3, 4]
console.log(arr);
```

**Unshift** - Adds an element to the start of the array. All elements need to shift one position.

```js
arr.unshift(0); // [0, 1, 2, 3, 4]
console.log(arr);
```

**Splice** - Can insert or remove elements at a specific index.

```js
arr.splice(2, 0, 99); // Insert 99 at index 2
console.log(arr); // [0, 1, 99, 2, 3, 4]
```

> Explanation:
>
> splice(startIndex, deleteCount, items...)
> Efficient for adding/removing elements in the middle, but requires shifting elements.

##### Accessing Elements

Accessing an element by its index is fast:

```js
const numbers = [10, 20, 30, 40];
let value = numbers[2]; // 30
console.log(value);
```

> Explanation:
>
> Arrays in JavaScript allow O(1) random access by index.

#### Traversing Arrays

**For Loop**

```js
for (let i = 0; i < numbers.length; i++) {
  console.log(numbers[i]);
}
```

**forEach Method**

```js
numbers.forEach((num) => console.log(num));
```

**for...of Loop**

```js
for (const num of numbers) {
  console.log(num);
}
```

> Explanation:
>
> Use traversal to process each element in the array.

All three methods are O(n) in time complexity.

| Operation                | Time Complexity | Space Complexity | Notes                        |
| ------------------------ | --------------- | ---------------- | ---------------------------- |
| Create empty array       | O(1)            | O(1)             | Minimal overhead             |
| Create array with values | O(n)            | O(n)             | Copies elements              |
| Access by index          | O(1)            | O(1)             | Random access                |
| Push (end)               | O(1)            | O(1)             | Adds at end                  |
| Pop (end)                | O(1)            | O(1)             | Removes from end             |
| Unshift (start)          | O(n)            | O(1)             | Shifts elements              |
| Shift (start)            | O(n)            | O(1)             | Shifts elements              |
| Splice (insert/remove)   | O(n)            | O(1)             | Depends on position          |
| Traverse                 | O(n)            | O(1)             | For loops, forEach, for...of |
