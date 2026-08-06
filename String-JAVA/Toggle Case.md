# 📝Toggle Case

---

## 🌟 Method 1: Without Built-in Functions (Interview Friendly)

### 💡 Logic
- Traverse the string character by character.
- If the character is a **lowercase letter (`a-z`)**, convert it to **uppercase** by subtracting `32`.
- If the character is an **uppercase letter (`A-Z`)**, convert it to **lowercase** by adding `32`.
- Keep spaces and other characters unchanged.
- Append each converted character to the result string.

```java
import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result = result + ch;
        }

        System.out.println("Toggle Case: " + result);
    }
}
```

### 📥 Input
```text
Hello World
```

### 📤 Output
```text
hELLO wORLD
```

---

### 📥 Input
```text
i LoVe InDiA
```

### 📤 Output
```text
I lOvE iNdIa
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Without Built-in | Traverse each character → `a-z` ➜ `A-Z` (`-32`) → `A-Z` ➜ `a-z` (`+32`) |

---
