s=input("Enter")
if(s==s[::-1]):
    print("palindrome")
else:


    print("not palindrome")

#another method

a=input("Enter")
rev=""
for i in a:
    rev=i+rev
if(a==rev):
    print("palindrome")
    
else:
    print("not palindrome")

#another method
b=input("Enter:")
is_palindrome=True
left=0
right=len(b)-1
while(left<right):
    if(b[left]!=b[right]):
        is_palindrome=False
        break
    left=left+1
    right=right-1
if is_palindrome:
    print("palinndrome")
else:
    print("not palindrome")
  