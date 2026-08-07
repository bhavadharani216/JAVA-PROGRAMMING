# 📝  Common Elements in Two Arrays

---

## 🌟 Method 1: Nested Loops (Brute Force)

### 💡 Logic
- Read the size and elements of the **first array**.
- Read the size and elements of the **second array**.
- Traverse each element of the first array.
- For every element, traverse the second array.
- If both elements are equal:
  - Print the common element.
  - Use `break` to avoid printing the same element multiple times for that iteration.
- Continue until all elements are checked.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
```

### 📥 Input
```text
3
1 4 21
4
21 4 26 44
```

### 📤 Output
```text
4
21
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Brute Force | Compare every element of the first array with every element of the second array → If equal, print it and `break` |

### ⏱️ Time Complexity
```text
O(n × m)
```

### 💾 Space Complexity
```text
O(1)
```

---

