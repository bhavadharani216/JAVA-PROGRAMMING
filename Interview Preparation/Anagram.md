# 📝 Anagram

---

## 🌟 Method 1: Using `Arrays.sort()`

### 💡 Logic
- Read two strings.
- First, check whether both strings have the **same length**.
- Convert both strings into character arrays using `toCharArray()`.
- Sort both character arrays using `Arrays.sort()`.
- Compare both arrays using `Arrays.equals()`.
- If both arrays are equal → **Anagram**.
- Otherwise → **Not Anagram**.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
