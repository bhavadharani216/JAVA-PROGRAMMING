# 📝 Find the Missing Number in an Array

---

## 🌟 Method 1: Using Sum Formula (Interview Friendly)

### 💡 Logic
- The array contains numbers from **1 to n**, with **one number missing**.
- Calculate the **expected sum** of numbers from `1` to `n`:
  ```java
  expected_sum = n * (n + 1) / 2;
  ```
- Calculate the **actual sum** of all elements in the array.
- The missing number is:
  ```java
  missing_number = expected_sum - actual_sum;
  ```
- Print the missing number.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int expected_sum = n * (n + 1) / 2;
        int actual_sum = 0;

        for (int i = 0; i < n - 1; i++) {
            actual_sum = actual_sum + arr[i];
        }

        int missing_num = expected_sum - actual_sum;

        System.out.println(missing_num);
    }
}
```

### 📥 Input
```text
5
1 3 4 5
```

### 📤 Output
```text
2
```

> ⚠️ **Note:** The first input should be **5**, not **4**, because the numbers are from **1 to 5** and one number (`2`) is missing. The array therefore contains only **4 elements**: `1 3 4 5`.

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Sum Formula | Calculate expected sum from `1` to `n` → Calculate actual array sum → Missing number = `expected_sum - actual_sum` |

### ⏱️ Time Complexity
```text
O(n)
```

### 💾 Space Complexity
```text
O(1)
```

---

