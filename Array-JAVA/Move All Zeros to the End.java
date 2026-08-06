# 📝 7. Move All Zeros to the End

---

## 🌟 Method 1: Two Pointer Approach (Interview Friendly)

### 💡 Logic
- Initialize a pointer `j = 0`.
- Traverse the array from left to right.
- If the current element is **non-zero**:
  - Swap it with the element at index `j`.
  - Increment `j`.
- After the traversal:
  - All **non-zero elements** are at the beginning.
  - All **zeros** are automatically moved to the end.
- The relative order of non-zero elements is preserved.

```java
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}
```

### 📥 Input
```text
7
0 5 0 3 0 2 1
```

### 📤 Output
```text
5 3 2 1 0 0 0
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Two Pointer | Traverse array → If element is non-zero, swap with index `j` → Increment `j` → Zeros move to the end |

---

