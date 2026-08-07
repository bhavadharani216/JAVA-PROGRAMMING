# 📝 Merge Two Arrays

---

## 🌟 Method 1: Using a Third Array (Interview Friendly)

### 💡 Logic
- Read the size and elements of the **first array**.
- Read the size and elements of the **second array**.
- Create a new array of size `n + m`.
- Copy all elements of the first array into the new array.
- Copy all elements of the second array after the first array.
- Print the merged array.

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

        int[] merge_arr = new int[n + m];

        for (int i = 0; i < n; i++) {
            merge_arr[i] = arr1[i];
        }

        for (int i = 0; i < m; i++) {
            merge_arr[n + i] = arr2[i];
        }

        for (int i = 0; i < merge_arr.length; i++) {
            System.out.print(merge_arr[i] + " ");
        }
    }
}
```

### 📥 Input
```text
3
2 44 1
5
2 4 5 6 7
```

### 📤 Output
```text
2 44 1 2 4 5 6 7
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Using Third Array | Create a new array of size `n + m` → Copy first array → Copy second array → Print merged array |

### ⏱️ Time Complexity
```text
O(n + m)
```

### 💾 Space Complexity
```text
O(n + m)
```

---

