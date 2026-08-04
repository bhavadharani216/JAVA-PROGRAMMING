num= int(input())
sum=0
for i in range(1, num):
    if num % i == 0:
        sum=sum+i
        
if (num == sum):
    print("it is perfect num")

else:
    print("it is not a perfect num")
        
