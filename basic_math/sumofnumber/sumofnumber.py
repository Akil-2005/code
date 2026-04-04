n=int(input("Enter:"))
sum=0
while(n>0):
    l=n%10
    sum=sum+l
    n=n//10
print(sum)