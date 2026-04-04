arr=[1,2,3,4,5]
n=len(arr)
k=2

k=k%n
for r in range(k):
    last=arr[n-1]
    for i in range(n-1,0,-1):
        arr[i]=arr[i-1]
    arr[0]=last
print(arr)