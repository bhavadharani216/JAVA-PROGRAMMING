# 📝 Right Rotate Array by K Positions

---

## 🌟 Method 1: Without Extra Array (Simple Traversal)

### 💡 Logic
- Read the array and the value of `k`.
- Reduce `k` using:
  ```java
  k = k % n;
  ```
  This handles cases where `k > n`.
- Print the last `k` elements first (from index `n - k` to `n - 1`).
- Then print the remaining elements (from index `0` to `n - k - 1`).
- This gives the array after **right rotation by `k` positions**.

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

        int k = sc.nextInt();
        k = k % n;

        for (int i = n - k; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        for (int i = 0; i < n - k; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
```

### 📥 Input
```text
5
1
2
3
4
5
2
```

### 📤 Output
```text
4
5
1
2
3
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Right Rotation | `k = k % n` → Print elements from `n-k` to `n-1` → Then print elements from `0` to `n-k-1` |

### ⏱️ Time Complexity
```text
O(n)
```

### 💾 Space Complexity
```text
O(1)
```

---
