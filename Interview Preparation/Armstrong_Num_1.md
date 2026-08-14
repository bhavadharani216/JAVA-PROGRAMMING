# 📝 30. Armstrong Number

---

## 🌟 Theory

An **Armstrong Number** is a number where the sum of each digit raised to the power of the **number of digits** is equal to the original number. ✨

For example:

```text
153
```

It has `3` digits.

```text
1³ + 5³ + 3³
= 1 + 125 + 27
= 153
```

Therefore, `153` is an **Armstrong Number**. 🌸

---

## 💡 Logic

- Store the original number.
- Count the number of digits.
- Extract each digit using:
  ```java
  digit = temp % 10;
  ```
- Raise each digit to the power of `digits`.
- Add all the values to `sum`.
- Compare `sum` with the original number.
- If both are equal → **Armstrong Number**.

---

## 🌸 Code

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;
        int temp = n;

        int digits = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;
        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;

            sum += Math.pow(digit, digits);

            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("It is Armstrong");
        } else {
            System.out.println("It is not an Armstrong");
        }
    }
}
```

---

## 📥 Example 1 — Armstrong Number ✅

### Input
```text
153
```

### 📤 Output
```text
It is Armstrong
```

### 🧠 Check

```text
153

1³ + 5³ + 3³
= 1 + 125 + 27
= 153

153 == 153 ✅
```

---

## 📥 Example 2 — Not an Armstrong Number ❌

### Input
```text
123
```

### 📤 Output
```text
It is not an Armstrong
```

### 🧠 Check

```text
123

1³ + 2³ + 3³
= 1 + 8 + 27
= 36

36 != 123 ❌
```

---

## 🎯 Quick Revision

| ✨ Step | 💡 Main Logic |
|--------|---------------|
| 1️⃣ | Store the original number |
| 2️⃣ | Count the number of digits |
| 3️⃣ | Extract each digit |
| 4️⃣ | Raise each digit to the power of `digits` |
| 5️⃣ | Add all values |
| 6️⃣ | Compare `sum` with the original number |

### ⏱️ Time Complexity
```text
O(d)
```

### 💾 Space Complexity
```text
O(1)
```

---

⭐ **Status:** ✅ Completed Problem #30
