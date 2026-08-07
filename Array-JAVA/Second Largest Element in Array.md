# 📝 Second Largest Element in an Array

---

## 🌟 Method 1: Linear Traversal (Without Sorting)

### 💡 Logic
- Initialize:
  - `max = Integer.MIN_VALUE`
  - `secmax = Integer.MIN_VALUE`
- Traverse the array.
- If the current element is greater than `max`:
  - Update `secmax = max`
  - Update `max = current element`
- Otherwise, if the current element is:
  - Greater than `secmax`, and
  - Not equal to `max`,
  - Update `secmax`.
- After the traversal, `secmax` contains the second largest element.

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

        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            } else if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
        }

        System.out.println(secmax);
    }
}
```

### 📥 Input
```text
4
23
43
44
23
```

### 📤 Output
```text
43
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Linear Traversal | Track both `max` and `secmax` → Update `max` first → Update `secmax` only if the element is smaller than `max` but larger than the current `secmax` |

### ⏱️ Time Complexity
```text
O(n)
```

### 💾 Space Complexity
```text
O(1)
```

---
 
