# 📝 Capitalize String

---

## 🌟 Method 1: Capitalize First Letter of Every Word

### 💡 Logic
- Split the string using `" "`.
- Convert only the **first character** of each word to uppercase.
- Keep the remaining characters unchanged.

```java
import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (String word : words) {
            char first = Character.toUpperCase(word.charAt(0));
            String rest = word.substring(1);

            System.out.print(first + rest + " ");
        }

        sc.close();
    }
}
```

### 📥 Input
```text
hello world java programming
```

### 📤 Output
```text
Hello World Java Programming
```

---

## 🌟 Method 2: Title Case (Capitalize First Letter + Remaining Lowercase)

### 💡 Logic
- Split the string using `" "`.
- Convert the **first character** to uppercase.
- Convert the **remaining characters** to lowercase.
- Print the modified word.

```java
import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (String word : words) {
            String result = Character.toUpperCase(word.charAt(0))
                          + word.substring(1).toLowerCase();

            System.out.print(result + " ");
        }

        sc.close();
    }
}
```

### 📥 Input
```text
i lOVE iNDIA
```

### 📤 Output
```text
I Love India
```

---

## 🌟 Method 3: Convert Entire String to Uppercase

### 💡 Logic
- Use the built-in `toUpperCase()` method.
- Convert every character in the string to uppercase.

```java
import java.util.Scanner;

public class UpperCaseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(str.toUpperCase());

        sc.close();
    }
}
```

### 📥 Input
```text
hello world
```

### 📤 Output
```text
HELLO WORLD
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Capitalize First Letter | Split → Convert only the first character to uppercase |
| 🌸 Title Case | Split → First character uppercase + Remaining lowercase |
| 🌸 Uppercase String | Use `toUpperCase()` to convert the entire string |

---

 