# 📝 Fibonacci Using Recursion

---

## 🌟 Theory

The **Fibonacci sequence** is a sequence where each number is the sum of the **previous two numbers**. 🔄

The sequence starts with:

```text
0 1 1 2 3 5 8 13 21 ...
```

### 🛑 Base Cases

```java
if (n == 0) {
    return 0;
}

if (n == 1) {
    return 1;
}
```

### 🔄 Recursive Case

```java
return Fibonacci(n - 1) + Fibonacci(n - 2);
```

---

## 💡 Logic

For `n = 5`:

```text
Fibonacci(5)
= Fibonacci(4) + Fibonacci(3)

= 3 + 2

= 5
```

So:

```text
Fibonacci(5) = 5
```

---

## 🌸 Code

```java
import java.util.*;

class Main {

    static int Fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(Fibonacci(n));
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
5
```

---

## 📥 Example 2

### Input
```text
8
```

### 📤 Output
```text
21
```

---

## 🎯 Quick Revision

| ✨ Concept | 💡 Main Logic |
|-----------|---------------|
| 🌸 Base Case 1 | `n == 0` → return `0` |
| 🌸 Base Case 2 | `n == 1` → return `1` |
| 🔄 Recursive Case | `Fibonacci(n-1) + Fibonacci(n-2)` |
| 📌 Sequence | `0 1 1 2 3 5 8 ...` |

### ⏱️ Time Complexity
```text
O(2ⁿ)
```

### 💾 Space Complexity
```text
O(n)
```

---

