arr=[1,2,3,4,5,7,6]
n=len(arr)

is_sorted=True
for i in range(n-1):
    if(arr[i]>arr[i+1]):
        is_sorted=False
        break
if is_sorted:
    print("sorted")
else:
    print("unsorted")