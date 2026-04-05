str=input("enter:")
n=len(str)
res=""
for i in range(n-1,-1,-1):
    res=res+str[i]
print(res)