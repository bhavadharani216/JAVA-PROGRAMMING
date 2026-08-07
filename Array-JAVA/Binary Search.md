# 📝  Binary Search

---

## 🌟 Method 1: Iterative Binary Search (Interview Friendly)

### 💡 Logic
- **Binary Search works only on a sorted array.**
- Initialize:
  - `left = 0`
  - `right = n - 1`
- Repeat while `left <= right`:
  - Find the middle index:
    ```java
    mid = (left + right) / 2;
    ```
  - If `arr[mid] == target`, print the index and exit.
  - If `arr[mid] < target`, search in the **right half**.
  - Otherwise, search in the **left half**.
- If the loop ends without finding the element, print **"Element not found"**.

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

        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}
```

### 📥 Input
```text
4
10 20 30 50
30
```

### 📤 Output
```text
Element found at index 2
```

---

### 📥 Input
```text
4
12 23 45 65
78
```

### 📤 Output
```text
Element not found
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Binary Search | Find `mid` → If target found, return → If target is greater, search right half → Otherwise, search left half |

### ⏱️ Time Complexity
```text
O(log n)
```

### 💾 Space Complexity
```text
O(1)
```
```
