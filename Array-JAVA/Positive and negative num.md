# 📝Rearrange Positive and Negative Numbers

---

## 🌟 Method 1: Two Pointer Approach (Interview Friendly)

### 💡 Logic
- Initialize two pointers:
  - `left` → Start of the array.
  - `right` → End of the array.
- Move `left` until a **positive** number is found.
- Move `right` until a **negative** number is found.
- Swap both elements.
- Repeat until `left >= right`.
- Result: All **negative numbers** are moved to the left, and **positive numbers** to the right.

> **📝 Note:** The relative order of elements is **not preserved**.

```java
import java.util.Scanner;

public class RearrangePositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left < right) {

            while (left < right && arr[left] < 0)
                left++;

            while (left < right && arr[right] >= 0)
                right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        System.out.println("Rearranged Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
```

### 📥 Input
```text
Enter size: 5

Enter array elements:
4
5
-6
8
1
```

### 📤 Output
```text
Rearranged Array:
-6 5 4 8 1
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Two Pointer | `left` → Find positive, `right` → Find negative, then swap until both pointers meet |

---

