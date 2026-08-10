# 📝Factorial Using Recursion

---

## 🌟 Theory

**Recursion** means a function **calls itself** to solve a smaller version of the same problem. 🔄

For factorial:

```text
n! = n × (n - 1)!
```

### 🛑 Base Case

The recursion must have a **base case** to stop:

```java
if (n == 0) {
    return 1;
}
```

### 🔄 Recursive Case

```java
return n * factorial(n - 1);
```

---

## 💡 Logic

For `5!`:

```text
5 × factorial(4)
    ↓
5 × 4 × factorial(3)
    ↓
5 × 4 × 3 × factorial(2)
    ↓
5 × 4 × 3 × 2 × factorial(1)
    ↓
5 × 4 × 3 × 2 × 1 × factorial(0)
    ↓
5 × 4 × 3 × 2 × 1 × 1
    ↓
120
```

---

## 🌸 Code

```java
import java.util.*;

class Main {

    static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}
```

---

## 📥 Example 1

### Input
```text
5
```

### 📤 Output
```text
120
```

---

## 📥 Example 2

### Input
```text
6
```

### 📤 Output
```text
720
```

---

## 🎯 Quick Revision

| ✨ Concept | 💡 Main Logic |
|-----------|---------------|
| 🌸 Recursion | Function calls itself |
| 🛑 Base Case | `n == 0` → return `1` |
| 🔄 Recursive Case | `n * factorial(n - 1)` |
| 📌 Purpose | Break the problem into smaller problems |

### ⏱️ Time Complexity
```text
O(n)
```

### 💾 Space Complexity
```text
O(n)
```

---
 