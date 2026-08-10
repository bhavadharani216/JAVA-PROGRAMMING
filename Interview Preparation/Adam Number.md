# 📝 Adam Number

---

## 🌟 Method 1: Using Reverse Function

### 💡 Logic
- Find the **reverse of the original number**.
- Find the **square of the reversed number**.
- Find the **square of the original number**.
- Reverse the square of the original number.
- Compare:
  ```java
  squareReverse == reverseSquare
  ```
- If both are equal → **Adam Number**.
- Otherwise → **Not Adam Number**.

### 🔍 Example Logic

For `12`:

```text
Reverse of 12 = 21

21² = 441

12² = 144

Reverse of 144 = 441

441 == 441
```

Therefore, `12` is an **Adam Number**. ✨

```java
import java.util.Scanner;

public class Main {

    public static int reverse(int n) {

        int rev = 0;

        while (n != 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;

        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int reverseNumber = reverse(n);

        int squareReverse = reverseNumber * reverseNumber;

        int squareOriginal = n * n;

        int reverseSquare = reverse(squareOriginal);

        if (squareReverse == reverseSquare)
            System.out.println("Adam Number");
        else
            System.out.println("Not Adam Number");

    }
}
```

---

## 📥 Example 1

### Input
```text
12
```

### Output
```text
Adam Number
```

### 🧠 Check
```text
Reverse of 12 = 21
21 × 21 = 441

12 × 12 = 144
Reverse of 144 = 441

441 == 441 ✅
```

---

## 📥 Example 2

### Input
```text
13
```

### Output
```text
Not Adam Number
```

### 🧠 Check
```text
Reverse of 13 = 31
31 × 31 = 961

13 × 13 = 169
Reverse of 169 = 961
```

Wait — `13` is also an **Adam Number** because:

```text
961 == 961 ✅
```

So the correct output is:

```text
Adam Number
```

---

## 🎯 Quick Revision

| ✨ Step | 💡 Logic |
|--------|----------|
| 1️⃣ | Find reverse of the number |
| 2️⃣ | Square the reversed number |
| 3️⃣ | Square the original number |
| 4️⃣ | Reverse the original square |
| 5️⃣ | Compare both values |

### ⏱️ Time Complexity
```text
O(log n)
```

### 💾 Space Complexity
```text
O(1)
```

---

 
