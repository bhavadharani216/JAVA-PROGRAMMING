# 📝 Two Sum

---

## 🌟 Method 1: Print the Pair of Elements

### 💡 Logic
- Traverse the array using two nested loops.
- `i` → First element.
- `j` → Second element (`i + 1` onwards).
- Check:
  ```java
  arr[i] + arr[j] == target
  ```
- If the sum matches the target:
  - Print the two elements.
  - Use `return` to exit immediately.

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
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return;
                }
            }
        }
    }
}
```

### 📥 Input
```text
5
2 6 3 8 9
5
```

### 📤 Output
```text
2 3
```

---

## 🌟 Method 2: Print the Indices of the Pair

### 💡 Logic
- Traverse the array using two nested loops.
- `i` → First index.
- `j` → Second index (`i + 1` onwards).
- Check:
  ```java
  arr[i] + arr[j] == target
  ```
- If the sum matches the target:
  - Print the indices `i` and `j`.
  - Use `return` to exit immediately.

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
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
```

### 📥 Input
```text
5
1 2 2 3 7
4
```

### 📤 Output
```text
0 3
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Print Pair | Use two nested loops → Check if `arr[i] + arr[j] == target` → Print the elements |
| 🌸 Print Indices | Use two nested loops → Check if `arr[i] + arr[j] == target` → Print the indices |

### ⏱️ Time Complexity
```text
O(n²)
```

### 💾 Space Complexity
```text
O(1)
```

---
