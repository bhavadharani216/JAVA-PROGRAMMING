# 📝 Tower of Hanoi Using Recursion

---

## 🌟 Theory

**Tower of Hanoi** is a classic recursion problem involving **3 rods** and `n` disks. 🗼

The three rods are:

```text
A → Source
B → Helper
C → Destination
```

### 📌 Rules

1. Only **one disk** can be moved at a time.
2. Only the **top disk** can be moved.
3. A larger disk **cannot be placed on a smaller disk**.

---

## 💡 Logic

To move `n` disks from **Source → Destination**:

### 🔄 Step 1
Move `n - 1` disks from:

```text
Source → Helper
```

### 🎯 Step 2
Move the largest disk from:

```text
Source → Destination
```

### 🔄 Step 3
Move `n - 1` disks from:

```text
Helper → Destination
```

### 🛑 Base Case

When there is only one disk:

```java
if (n == 1) {
    System.out.println("Move disk 1 from " + source + " to " + destination);
    return;
}
```

---

## 🌸 Code

```java
import java.util.*;

class Main {

    static void towerOfHanoi(int n, char source, char helper, char destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        towerOfHanoi(n, 'A', 'B', 'C');
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
Move disk 1 from A to B
Move disk 2 from A to C
Move disk 1 from B to C
```

---

## 📥 Example 2

### Input
```text
3
```

### 📤 Output
```text
Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
Move disk 3 from A to C
Move disk 1 from B to A
Move disk 2 from B to C
Move disk 1 from A to C
```

---

## 🎯 Quick Revision

| ✨ Step | 💡 Main Logic |
|--------|---------------|
| 1️⃣ | Move `n-1` disks from Source → Helper |
| 2️⃣ | Move disk `n` from Source → Destination |
| 3️⃣ | Move `n-1` disks from Helper → Destination |
| 🛑 | Base case: `n == 1` |

### 🔢 Minimum Number of Moves

```text
2ⁿ - 1
```

### ⏱️ Time Complexity
```text
O(2ⁿ)
```

### 💾 Space Complexity
```text
O(n)
```

---

