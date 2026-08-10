# 📝 Permutations of a String Using Recursion

---

## 🌟 Theory

A **permutation** is a possible arrangement of all characters of a string. 🔄

For a string with `n` characters, the total number of permutations is:

```text
n!
```

For example, the string:

```text
ABC
```

has:

```text
3! = 6
```

permutations.

---

## 💡 Logic

- `str` → Characters that are still available.
- `ans` → Characters already selected for the current permutation.
- Choose one character from `str`.
- Remove that character from `str`.
- Add it to `ans`.
- Recursively continue with the remaining characters.
- When `str.length() == 0`, a complete permutation is formed.

### 🛑 Base Case

```java
if (str.length() == 0) {
    System.out.println(ans);
    return;
}
```

### 🔄 Recursive Case

For every character:

```java
char ch = str.charAt(i);
```

Remove the selected character:

```java
String remaining =
        str.substring(0, i) + str.substring(i + 1);
```

Then recursively generate the remaining characters:

```java
permutations(remaining, ans + ch);
```

---

## 🌸 Code

```java
import java.util.*;

class Main {

    static void permutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String remaining =
                    str.substring(0, i) + str.substring(i + 1);

            permutations(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        permutations(str, "");
    }
}
```

---

## 📥 Example 1

### Input
```text
ABC
```

### 📤 Output
```text
ABC
ACB
BAC
BCA
CAB
CBA
```

---

## 📥 Example 2

### Input
```text
AB
```

### 📤 Output
```text
AB
BA
```

---

## 🎯 Quick Revision

| ✨ Concept | 💡 Main Logic |
|-----------|---------------|
| 🌸 `str` | Characters still available |
| 🌸 `ans` | Characters selected so far |
| 🔄 Choose | Select one character |
| ✂️ Remove | Remove selected character from `str` |
| 🔁 Recursion | Continue with remaining characters |
| 🛑 Base Case | `str.length() == 0` → Print `ans` |

### 🔢 Number of Permutations

For `n` distinct characters:

```text
n!
```

### ⏱️ Time Complexity
```text
O(n × n!)
```

### 💾 Space Complexity
```text
O(n)
```

---
 
