arr=[1,2,0,3,4,0]
n=len(arr)

index=0
for i in range(n):
    if(arr[i]!=0):
        arr[index]=arr[i]
        index=index+1
for j in range(index,n):
    arr[j]=0
print(arr)