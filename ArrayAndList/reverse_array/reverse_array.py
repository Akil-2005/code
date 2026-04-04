arr=[1,2,3,4,5]
n=len(arr)
for i in range(n//2):
    temp=arr[i]
    arr[i]=arr[n-i-1]
    arr[n-i-1]=temp
print(arr)