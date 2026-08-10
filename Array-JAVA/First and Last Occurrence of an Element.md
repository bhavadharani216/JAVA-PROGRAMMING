# 📝 First and Last Occurrence of an Element

---

## 🌟 Method 1: Linear Traversal

### 💡 Logic
- Initialize `first = -1` and `last = -1`.
- Traverse the array from left to right.
- If the current element matches the `target`:
  - If `first == -1`, store the current index as the **first occurrence**.
  - Always update `last` with the current index.
- After traversal:
  - `first` → First occurrence index.
  - `last` → Last occurrence index.
- If the element is not present, both remain `-1`.

```java
class Main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 5, 7, 5, 9};
        int target = 5;

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
}
```

---

## 📥 Example 1 — Element Present ✅

### Input
```text
Array: 2 5 3 5 7 5 9
Target: 5
```

### 📤 Output
```text
First = 1
Last = 5
```

### 🧠 Check
```text
2  5  3  5  7  5  9
   ↑        ↑     ↑
   1        3     5

First occurrence = 1
Last occurrence  = 5
```

---

## 📥 Example 2 — Element Not Present ❌

### Input
```text
Array: 2 5 3 5 7 5 9
Target: 10
```

### 📤 Output
```text
First = -1
Last = -1
```

---

## 🎯 Quick Revision

| ✨ Variable | 💡 Meaning |
|-----------|------------|
| 🌸 `first` | Stores the first occurrence index |
| 🌸 `last` | Stores the latest occurrence index |
| 🌸 `-1` | Element has not been found |

### ⏱️ Time Complexity
```text
O(n)
```

### 💾 Space Complexity
```text
O(1)
```

---

