# 📝Count Consonants

---

## 🌟 Method 1: Without Built-in Functions (Interview Friendly)

### 💡 Logic
- Traverse the string character by character.
- Convert uppercase letters (`A-Z`) to lowercase (`a-z`) by adding `32`.
- Check if the character is an alphabet.
- If it is **not** a vowel (`a`, `e`, `i`, `o`, `u`), increment the consonant count.
- Print the total number of consonants.

```java
import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            if (ch >= 'a' && ch <= 'z') {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    count++;
                }
            }
        }

        System.out.println("The number of consonants is " + count);
    }
}
```

### 📥 Input
```text
bhava
```

### 📤 Output
```text
The number of consonants is 3
```

---

## 🎯 Quick Revision

| ✨ Method | 💡 Main Logic |
|-----------|---------------|
| 🌸 Without Built-in | Traverse → Convert uppercase to lowercase → Check alphabet → If not a vowel, count it as a consonant |

---

