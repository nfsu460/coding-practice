# 4. Array Game

Given an array of integers, determine the number of moves to make all elements equal. Each move consists of choosing all but 1 element and incrementing their values by 1.

**Example**
numbers = [3, 4, 6, 6, 3]
Choose 4 of the 5 elements during each move and increment each of their values by one. Indexing begins at 1. It takes 7 moves as follows:
| Iteration | Array | Unchanged Element's Index |
|:--:|:--:|:--:|
| 0 | [3, 4, 6, 6, 3] | |
| 1 | [4, 5, 7, 6, 4] | 3 |
| 2 | [5, 6, 7, 7, 5] | 2 |
| 3 | [6, 7, 8, 7, 6] | 3 |
| 4 | [7, 8, 8, 8, 7] | 2 |
| 5 | [8, 9, 9, 8, 8] | 3 |
| 6 | [9, 9, 10, 9, 9] | 1 |
| 7 | [10, 10, 10, 10, 10] | 2 |

**Function Description**
Complete the function countMoves in the editor below.

The function has the following parameter(s):

```
int numbers[n]: an array of integers
```

Returns:
`long: the minimum number of moves required`

Prints:
distinct element pairs that share the minimum absolute difference, displayed in ascending order with each pair separated by one space on a single line

**Constraints**

- 1 ≤ n ≤ 10<sup>5</sup>
- 1 ≤ numbers[i] ≤ 10<sup>6</sup>

**Sample Input**

- [5, 6, 8, 8, 5]

**Sample Output**

```
7
```

**Explanation**

- Make the following moves:

```
1. fixed value at numbers[3]-> [6, 7, 9, 8, 6]
2. fixed value at numbers[2]-> [7, 8, 9, 9, 7]
3. fixed value at numbers[3]-> [8, 9, 10, 9, 8]
4. fixed value at numbers[2]-> [9, 10, 10, 10, 9].
5. fixed value at numbers[3]-> [10, 11, 11, 10, 10].
6. fixed value at numbers[1]-> [11, 11, 12, 11, 11].
7. fixed value at numbers[2]-> [12, 12, 12, 12, 12].
```

**Sample Test Case 1**

- [2, 2, 2]

**Sample Output**

```
0
```

**Explanation**
- Initially, numbers = [2, 2, 2]. Because all of its elements are already equal, no moves are
required.

```Java
import java.io.*;
import java.util.*;

class Result{
	public static long countMoves(List<Integer> numbers){
		// Write your code here
	}
}
```
