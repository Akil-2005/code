arr=[1,2,3,4,5]
n=len(arr)

first=arr[0]
second=arr[0]

for i in range(n):
    if(arr[i]>first):
        second=first
        first=arr[i]
    elif(arr[i]>second and arr[i]!=first):
        second=arr[i]
print(first)
print(second)