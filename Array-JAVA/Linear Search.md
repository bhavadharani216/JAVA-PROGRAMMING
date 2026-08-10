# 📝   Linear Search

---

## 🌟 Method 1: Linear Search

### 💡 Logic
- Read the size and elements of the array.
- Read the `target` element.
- Traverse the array from **left to right**.
- If `arr[i] == target`:
  - Print **"Found"**.
  - Use `return` to stop the program immediately.
- If the loop completes without finding the target, print **"Not Found"**.

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

        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Not Found");
    }
}
```

---

## 📥 Example 1 — Element Found ✅

### Input
```text
5
10 25 30 45 50
30
```

### 📤 Output
```text
Found
```

---

## 📥 Example 2 — Element Not Found ❌

### Input
```text
5
10 25 30 45 50
70
```

### 📤 Output
```text
Not Found
```

---

## 🎯 Quick Revision

| ✨ Step | 💡 Main Logic |
|--------|---------------|
| 1️⃣ | Start from the first element |
| 2️⃣ | Compare each element with `target` |
| 3️⃣ | If equal → `Found` |
| 4️⃣ | If loop ends → `Not Found` |

### ⏱️ Time Complexity
```text
O(n)
```

### 💾 Space Complexity
```text
O(1)
```

---
