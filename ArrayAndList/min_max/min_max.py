arr=[12,3,45,65,1]
max=arr[0]
min=arr[0]
for i in range(len(arr)):
    if arr[i]>max:
        max=arr[i]
    elif arr[i]<min:
        min=arr[i]
print("max:",max)
print("min:",min)