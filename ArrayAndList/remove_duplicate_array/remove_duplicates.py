arr=[1,1,2,2,3,3,4,5]
n=len(arr)

res=[]
size=0

for i in range(n):
    found=False
    for j in range(len(res)):
        if(arr[i]==res[j]):
            found=True
            break
    if not found:
         res.append(arr[i])
        
print(res)
       

