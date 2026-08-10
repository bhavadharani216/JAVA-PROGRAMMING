# 📝 Bubble Sort

---

## 🌟 Theory

**Bubble Sort** is a simple sorting algorithm that repeatedly compares **adjacent elements** and swaps them if they are in the wrong order.

After every pass, the **largest unsorted element moves to the end** of the array. 🫧

### 🔑 Key Points
- Compare adjacent elements.
- Swap when the left element is greater than the right element.
- After each pass, one largest element reaches its correct position.
- Continue until the entire array is sorted.

---

## 💡 Logic

For the array:

```text
5 2 4 1
```

### 🔄 Pass 1
```text
5 2 → Swap → 2 5
5 4 → Swap → 2 4 5
5 1 → Swap → 2 4 1 5
```

Largest element `5` reaches the end. 🎯

### 🔄 Pass 2
```text
2 4 → No Swap
4 1 → Swap → 2 1 4 5
```

### 🔄 Pass 3
```text
2 1 → Swap → 1 2 4 5
```

### ✅ Final Array
```text
1 2 4 5
```

---

## 🌸 Code

```java
class Main {
    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 1};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
5 2 4 1
```

### 📤 Output
```text
1 2 4 5
```

---

## 📥 Example 2

### Input
```text
9 3 7 1 5
```

### 📤 Output
```text
1 3 5 7 9
```

---

## 🎯 Quick Revision

| ✨ Concept | 💡 Main Logic |
|-----------|---------------|
| 🌸 Compare | Compare adjacent elements |
| 🔄 Swap | Swap if `arr[j] > arr[j + 1]` |
| 🎯 Pass | Largest unsorted element moves to the end |
| 🔁 Repeat | Continue for all passes |

### ⏱️ Time Complexity

**Worst Case:**
```text
O(n²)
```

**Average Case:**
```text
O(n²)
```

### 💾 Space Complexity
```text
O(1)
```

---

