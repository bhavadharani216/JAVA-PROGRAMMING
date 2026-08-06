
---

# 📝 Reverse Word

## 🌟 Method 1: Reverse Each Word (Simple)

### 💡 Logic
- Split the string using `" "`.
- Traverse each word.
- Print the characters of each word from **last ➜ first**.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String words[] = s.split(" ");

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
```

### 📥 Input
```text
i love javca
```

### 📤 Output
```text
i evol acvaj
```

---

## 🌟 Method 2: Reverse the Order of Words

### 💡 Logic
- Split the string using `" "`.
- Traverse the array from **last ➜ first**.
- Print each word.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
```

### 📥 Input
```text
I love Java
```

### 📤 Output
```text
Java love I
```

---

## 🌟 Method 3: Reverse the Entire String

### 💡 Logic
- Traverse the string from **last index ➜ first index**.
- Print each character.

```java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
```

### 📥 Input
```text
I love Java
```

### 📤 Output
```text
avaJ evol I
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Reverse Each Word | Split → Reverse every word individually |
| 🌸 Reverse Word Order | Split → Traverse array from end to start |
| 🌸 Reverse Entire String | Traverse string from last index to first |

---
 