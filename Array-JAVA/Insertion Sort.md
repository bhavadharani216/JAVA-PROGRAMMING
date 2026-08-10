# 📝 Insertion Sort

---

## 🌟 Theory

**Insertion Sort** is a simple sorting algorithm that builds the sorted array **one element at a time**. 🌸

It works similar to arranging **playing cards in your hand**. 🃏

- Start from the second element.
- Consider it as the `key`.
- Compare the `key` with the elements on its left.
- Shift larger elements one position to the right.
- Insert the `key` into its correct position.
- Repeat until the entire array is sorted.

---

## 💡 Logic

For the array:

```text
5 3 4 1 2
```

### 🔄 Step 1
`key = 3`

```text
5 3
```

Since `5 > 3`, shift `5` and insert `3`.

```text
3 5 4 1 2
```

### 🔄 Step 2
`key = 4`

```text
3 5 4
```

Since `5 > 4`, shift `5` and insert `4`.

```text
3 4 5 1 2
```

### 🔄 Step 3
`key = 1`

```text
3 4 5 1
```

Shift all larger elements and insert `1`.

```text
1 3 4 5 2
```

### 🔄 Step 4
`key = 2`

Shift larger elements and insert `2`.

```text
1 2 3 4 5
```

### ✅ Final Array

```text
1 2 3 4 5
```

---

## 🌸 Code

```java
class Main {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];

                j--;
            }

            arr[j + 1] = key;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

## 📥 Example 1

### Input
```text
5 3 4 1 2
```

### 📤 Output
```text
1 2 3 4 5
```

---

## 📥 Example 2

### Input
```text
8 4 6 2 9
```

### 📤 Output
```text
2 4 6 8 9
```

---

## 🎯 Quick Revision

| ✨ Concept | 💡 Main Logic |
|-----------|---------------|
| 🌸 `key` | Current element to be inserted |
| 🔍 Compare | Compare `key` with elements on the left |
| ➡️ Shift | Shift larger elements one position right |
| 📌 Insert | Place `key` at `arr[j + 1]` |
| 🔁 Repeat | Continue until the array is sorted |

### ⏱️ Time Complexity

**Best Case:**
```text
O(n)
```

**Average Case:**
```text
O(n²)
```

**Worst Case:**
```text
O(n²)
```

### 💾 Space Complexity
```text
O(1)
```

---

