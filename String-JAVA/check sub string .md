# 📝 Check Substring

---

## 🌟 Method 1: Using `contains()`

### 💡 Logic
- Read the main string and the substring.
- Use `contains()` to check whether the substring exists.
- If it exists, print **"Substring is present"**; otherwise, print **"Substring is not present"**.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.contains(t)) {
            System.out.println("Substring is present");
        } else {
            System.out.println("Substring is not present");
        }
    }
}
```

### 📥 Input
```text
String 1: god fool
String 2: fool
```

### 📤 Output
```text
Substring is present
```

---

## 🌟 Method 2: Using `indexOf()`

### 💡 Logic
- Read the main string and the substring.
- Use `indexOf()` to find the starting index of the substring.
- If the result is **not `-1`**, the substring exists.
- If the result is **`-1`**, the substring does not exist.

```java
import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        if (str.indexOf(sub) != -1) {
            System.out.println("Substring Found");
        } else {
            System.out.println("Substring Not Found");
        }

        sc.close();
    }
}
```

### 📥 Input
```text
String 1: GOODFOOD
String 2: DFOOD
```

### 📤 Output
```text
Substring Found
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 `contains()` | Returns `true` if the substring exists |
| 🌸 `indexOf()` | Returns the starting index if found, otherwise `-1` |

---

 
