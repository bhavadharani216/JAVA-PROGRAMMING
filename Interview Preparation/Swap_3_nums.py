a = int(input("Enter a: "))
b = int(input("Enter b: "))
c = int(input("Enter c: "))

print("Before swapping:")
print("a =", a)
print("b =", b)
print("c =", c)

# Cyclic swap without temp variable
a = a + b + c
b = a - (b + c)   # Original a
c = a - (b + c)   # Original b
a = a - (b + c)   # Original c

print("After swapping:")
print("a =", a)
print("b =", b)
print("c =", c)
