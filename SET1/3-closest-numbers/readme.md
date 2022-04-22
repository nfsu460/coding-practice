# 3. Closest Numbers

Given an array of distinct integers, determine the minimum absolute difference between any two elements. Print all element pairs with that difference in ascending order.

**Example**
numbers = [6, 2, 4, 10]
The minimum absolute difference is 2 and the pairs with that difference are (2, 4) and (4, 6). When printing element pairs (i, j), they should be ordered ascending first by i and then by j.

```
2 4
4 6
```

**Function Description**
Complete the function closestNumbers in the editor below.

The function has the following parameter(s):

```
int numbers[n]: an array of integers
```

Returns:
`NONE`

Prints:
distinct element pairs that share the minimum absolute difference, displayed in ascending order with each pair separated by one space on a single line

**Constraints**

- 2 ≤ n ≤ 10<sup>5</sup>
- -10<sup>9 </sup>≤ numbers[i] ≤ 10<sup>9</sup>

**Sample Input**

- [4, 2, 1, 3]

**Sample Output**

```
1 2
2 3
3 4
```

**Explanation**

- The minimum absolute difference between any two elements in the array is 1, and there are three such pairs having this difference: (1, 2), (2, 3), and (3, 4).

**Sample Test Case 1**

- [4, -2, -1, 3]

**Sample Output**

```
-2 -1
3 4
```

**Explanation**
\*The minimum absolute difference between any two elements in the array is 1, and there are two such pairs: (-2, -1) and (3, 4).

```Java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static void closestNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
        int min = Integer.MAX_VALUE;
        int n = numbers.size();
        for (int i = 1; i < n; i++) {
            min = Math.min(Math.abs(numbers.get(i - 1) - numbers.get(i)), min);
        }

        for (int i = 1; i < n; i++) {
            int a = numbers.get(i - 1);
            int b = numbers.get(i);
            if(Math.abs(a - b) == min)
                System.out.println(a + " " + b);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 2, 4, 10}; // 2 4, 4 6
        int[] arr2 = {4, 2, 1, 3}; // 1 2, 2 3, 3 4
        int[] arr3 = {4, -2, -1, 3}; // -2 -1, 3 4

        ArrayList<Integer> input = new ArrayList<>();
        for(int num : arr3) input.add(num);
        closestNumbers(input);
    }
}

```
