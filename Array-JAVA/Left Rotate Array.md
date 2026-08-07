# 📝 Left Rotate Array by K Positions

---

## 🌟 Method 1: Without Extra Array (Simple Traversal)

### 💡 Logic
- Read the array and the value of `k`.
- Reduce `k` using:
  ```java
  k = k % n;
  ```
  This handles cases where `k > n`.
- Print the elements from index `k` to `n - 1`.
- Then print the elements from index `0` to `k - 1`.
- This gives the array after **left rotation by `k` positions**.

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

        for (int i = k; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        for (int i = 0; i < k; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
```

### 📥 Input
```text
4
2
5
8
9
2
```

### 📤 Output
```text
8
9
2
5
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Left Rotation | `k = k % n` → Print elements from `k` to `n-1` → Then print elements from `0` to `k-1` |

### ⏱️ Time Complexity
```text
O(n)
```

### 💾 Space Complexity
```text
O(1)
```

---

