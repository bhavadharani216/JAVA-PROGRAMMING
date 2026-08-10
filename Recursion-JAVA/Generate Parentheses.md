# 📝 Generate Parentheses Using Recursion

---

## 🌟 Theory

The **Generate Parentheses** problem generates all possible combinations of `n` pairs of parentheses that are **valid and balanced**. 🔄

For example, when:

```text
n = 2
```

The valid combinations are:

```text
(())
()()
```

### 📌 Rules for Valid Parentheses

- We can add `(` only when:
  ```text
  open < n
  ```
- We can add `)` only when:
  ```text
  close < open
  ```
- This ensures that we never have more closing parentheses than opening parentheses.

---

## 💡 Logic

The function uses:

- `str` → Current parentheses string.
- `open` → Number of opening parentheses used.
- `close` → Number of closing parentheses used.
- `n` → Number of pairs required.

### 🛑 Base Case

When the string length becomes `2 * n`:

```java
if (str.length() == 2 * n) {
    System.out.println(str);
    return;
}
```

A complete valid combination is formed. ✅

### 🔄 Add Opening Parenthesis

If we still have opening parentheses available:

```java
if (open < n) {
    generate(str + "(", open + 1, close, n);
}
```

### 🔄 Add Closing Parenthesis

A closing parenthesis can be added only when there are more opening parentheses:

```java
if (close < open) {
    generate(str + ")", open, close + 1, n);
}
```

---

## 🌸 Code

```java
import java.util.*;

class Main {

    static void generate(String str, int open, int close, int n) {

        if (str.length() == 2 * n) {
            System.out.println(str);
            return;
        }

        if (open < n) {
            generate(str + "(", open + 1, close, n);
        }

        if (close < open) {
            generate(str + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        generate("", 0, 0, n);
    }
}
```

---

## 📥 Example 1

### Input
```text
2
```

### 📤 Output
```text
(())
()()
```

---

## 📥 Example 2

### Input
```text
3
```

### 📤 Output
```text
((()))
(()())
(())()
()(())
()()()
```

---

## 🎯 Quick Revision

| ✨ Concept | 💡 Main Logic |
|-----------|---------------|
| 🌸 `open` | Number of `(` used |
| 🌸 `close` | Number of `)` used |
| 🔓 `open < n` | We can add `(` |
| 🔒 `close < open` | We can add `)` |
| 🛑 Base Case | `str.length() == 2 * n` |
| ✅ Validity | Never allow `close > open` |

### 🔢 Number of Valid Combinations

The number of valid combinations for `n` pairs is the **n-th Catalan number**.

### ⏱️ Time Complexity
```text
O(4ⁿ / √n)
```

### 💾 Space Complexity
```text
O(n)
```

---

