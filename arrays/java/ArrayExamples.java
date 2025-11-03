
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {
        // Creating arrays
        int[] arr1 = new int[0]; // Empty array - fixed size, O(1)
        int[] arr2 = new int[10]; // Predefined size, all elements default to 0
        int[] arr3 = {1, 2, 3, 4, 5}; // Initialized with values

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // Using ArrayList for dynamic operations
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        list.add(5); // Add to end - O(1) amortized
        list.add(6);
        System.out.println(list);

        list.add(0, 12); // Insert at start - O(n) because elements are shifted
        System.out.println(list);

        list.add(2, 5); // Insert at arbitrary index - O(n) shifting elements
        System.out.println(list);

        // Accessing elements
        int[] accessArr = {10, 20, 30, 40};
        int value = accessArr[2]; // O(1)
        System.out.println(value);

        // Traversing arrays
        for (int i = 0; i < accessArr.length; i++) { // O(n)
            System.out.println(accessArr[i]);
        }

        for (int num : accessArr) { // Enhanced for-loop, O(n)
            System.out.println(num);
        }

        // Traversing ArrayList
        for (int num : list) { // O(n)
            System.out.println(num);
        }
    }
}
