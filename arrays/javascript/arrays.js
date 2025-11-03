// Creating an array
const arr1 = [];
const arr2 = new Array(10); // Time complexity: O(1) | Space Complexity: O(1)
const arr3 = [1, 2, 3, 4, 5]; // Time complexity: O(n) | Space Complexity: O(1)
console.log(arr1);
console.log(arr2);
console.log(arr3);

// Inserting elements into an array
const insertArr = [1, 2, 3, 4];
insertArr.push(5); // Push - adds and element to the end of the array
insertArr.push(6); // Time complexity: O(1) | Space Complexity: O(1)
console.log(insertArr);

insertArr.unshift(12); // unshift - adds an element to the front of the array
// all elements have to be shifted one position to the right to allow the element to be added.
// Time complexity: O(n) | Space Complexity: O(1)
console.log(insertArr);

insertArr.splice(2, 0, 5); // Start index, elements to remove, elements to add
console.log(insertArr); // Time complexity: O(n) | Space Complexity: O(1)

// Accessing Array Elements - Array Traversal
const accessArr = [10, 20, 30, 40];
let value = accessArr[2];
console.log(value);

// For loop
// Time complexity: O(n) | Space Complexity: O(1)
for (let i = 0; i < accessArr.length; i++) {
  console.log(accessArr[i]);
}

console.log("=============");

// forEach
accessArr.forEach((e) => {
  console.log(e);
});

// for ... if
// Time complexity: O(n) | Space Complexity: O(1)
for (const element of arr) {
  console.log(element);
}
