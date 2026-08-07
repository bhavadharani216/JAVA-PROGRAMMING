# 📝Largest Element in an Array

---

## 🌟 Method 1: Linear Traversal (Without Sorting)

### 💡 Logic
- Assume the **first element** is the largest.
- Traverse the array from the second element.
- If the current element is greater than `max`, update `max`.
- After completing the traversal, `max` contains the largest element.

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

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
```

### 📥 Input
```text
8
32
65
978
324
543
999
543
1
```

### 📤 Output
```text
999
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Linear Traversal | Assume the first element is maximum → Compare each element with `max` → Update `max` whenever a larger element is found |

### ⏱️ Time Complexity
```text
O(n)
```

### 💾 Space Complexity
```text
O(1)
```

---

 
