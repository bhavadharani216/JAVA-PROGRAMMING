# 📌 Count Occurrences of a Word in a String

## 🧩 Problem Statement

You are given a string `str` composed of multiple words and another string `word` which is a single word.

Your task is to **calculate the number of occurrences of the given word in the string `str`** and print the count.

### Notes

* If `str` or `word` is empty, print **-1**.
* If the length of `str` is less than the length of `word`, print **-1**.
* Every word in the string is separated by a **single space**.
* Each word can contain up to **1000 characters**.

---

## 📥 Input Format

The input consists of **4 lines**:

1. Integer — length of the string `str`
2. String — sentence containing words separated by spaces
3. Integer — length of the word
4. String — word to be searched

---

## 📤 Output Format

Print a single integer representing:

```
Number of occurrences of the given word in the string
```

---

## 📌 Constraints

```
0 < length of each string < 10^9
```

(No additional constraints specified)

---

## 🧪 Sample Input

```
52
abcd efgh ijklmn efgh ijklmn opqrs ijklmn opqrs zxya
6
ijklmn
```

---

## ✅ Sample Output

```
3
```

---

## 💡 Explanation

The word **"ijklmn"** appears **3 times** in the sentence:

```
abcd efgh ijklmn efgh ijklmn opqrs ijklmn opqrs zxya
```

Hence, the output is:

```
3
```

---
 