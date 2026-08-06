# 📝 Triplet Sum

---

## 🌟 Method 1: Brute Force (Interview Friendly)

### 💡 Logic
- Use **three nested loops**.
- `i` → First element.
- `j` → Second element (`i + 1` onwards).
- `k` → Third element (`j + 1` onwards).
- Check whether:
  ```java
  arr[i] + arr[j] + arr[k] == target
  ```
- If the sum matches the target:
  - Print the triplet.
  - Use `return` to exit the program immediately.
- If no triplet is found after checking all combinations, print **"Triplet Not Found"**.

```java
import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        return;
                    }
                }
            }
        }

        System.out.println("Triplet Not Found");
    }
}
```

### 📥 Input
```text
6
1 4 45 6 10 8
22
```

### 📤 Output
```text
4 10 8
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Brute Force | `i` → First element → `j` → Second element → `k` → Third element → Check if their sum equals the target |

### ⏱️ Time Complexity
```text
O(n³)
```

### 💾 Space Complexity
```text
O(1)
```

---

