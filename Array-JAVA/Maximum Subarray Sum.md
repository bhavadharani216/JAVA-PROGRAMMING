# 📝 Maximum Subarray Sum (Kadane's Algorithm)

---

## 🌟 Method 1: Kadane's Algorithm (Interview Friendly)

### 💡 Logic
- Initialize:
  - `currentSum = arr[0]`
  - `maxSum = arr[0]`
- Traverse the array from the second element.
- For every element:
  - Decide whether to:
    - **Start a new subarray** from the current element, or
    - **Extend the existing subarray**.
- Update:
  ```java
  currentSum = Math.max(arr[i], currentSum + arr[i]);
  ```
- Keep track of the maximum sum found:
  ```java
  maxSum = Math.max(maxSum, currentSum);
  ```
- After the loop, `maxSum` contains the maximum subarray sum.

```java
import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}
```

### 📥 Input
```text
9
-2 1 -3 4 -1 2 1 -5 4
```

### 📤 Output
```text
Maximum Sum = 6
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Kadane's Algorithm | For each element, choose the maximum between starting a new subarray (`arr[i]`) or extending the current subarray (`currentSum + arr[i]`) |

### ⏱️ Time Complexity
```text
O(n)
```

### 💾 Space Complexity
```text
O(1)
```

---

