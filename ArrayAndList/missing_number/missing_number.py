arr=[1,2,4,5,6]
n=len(arr)
a=arr[n-1]
sum=0
total=a*(a+1)/2
for i in range(n):
    sum=sum+arr[i]
missed=total-sum
print(int(missed))