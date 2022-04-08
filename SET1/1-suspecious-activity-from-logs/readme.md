# 1. Suspicious Activity From Logs

Application logs are useful in analyzing interaction with an application and may also be used to detect suspicious activities.

A log file is provided as a string array where each entry represents a money transfer in the form "sender_user_id recipient_user_id amount". Each of the values is separated by a space.

* `sender_user_id` and `recipient_user_id` both consist only of digits, are at most 9 digits long and start with non-zero digit
* `amount` consists only of digits, is at most 9 digits long and starts with non-zero digit

Logs are given in no particular order. Write a function that returns an array of strings denoting user_id's of suspicious users who were involved in at least threshold number of log entries. The id's should be ordered ascending by numeric value.

### Example
```Java
logs = ["88 99 200", "88 99 300", "99 32 100", "12 12 15"]
threshold = 12
```

The transactions count for each user, regardless of role are:

|ID|Transactions|
|-|:-:|
|99|3|
|88|2|
|12|1|
|32|1|

There are two users with at least threshold = 2 transactions: 99 and 88. In ascending order, the return array is ['88', '99'].

**Note:** In the last log entry, user 12 was on both sides of the transaction. This counts as only 1 transaction for user 12.

**Function Description**
Complete the function processLogs in the editor below.

The function has the following parameter(s):
```
string logs[n]: each logs[i] denotes the ith entry in the logs
int threshold: the minimum number of transactions that a user must have to be 
included in the result
```
Returns:
`string[]: an array of user id's as strings, sorted ascending by numeric value`

**Constraints**
* 1≤n≤ 105
* 1 ≤ thresholds n
* The `sender_user_id`, `recipient_user_id` and amount contain only characters in the range ascii['0'-'9'].
* The `sender_user_id`, `recipient_user_id` and amount start with a non-zero digit.
* 0 < length of `sender_user_id`, `recipient_user_id`, amounts <= 9.
* The result will contain at least one element.

**Sample Input**
* n = 4
* logs = ["9 750", "22 7 20", "33 7 50", "22 7 30"]
* threshold = 3

**Sample Output**
7

**Explanation**
|ID|Transactions|
|-|:-:|
|9|1|
|7|4|
|22|2|
|33|1|

Only user 7 has 3 or more transactions.
The return array is ["7"] 

```Java
import java.io.*;
import java.util.*;

class solution.Result{
	public static List<String> processLogs(List<String> logs, int threshold){
		// Write your code here
	}
}
```
