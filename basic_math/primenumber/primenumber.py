n=int(input("Enter:"))
isprime=True
if(n<=1):
   isprime=False
else:
   for i in range(2,int(n+1/2)):
      if(n%i==0):
         isprime=False
         break
if isprime:
   print("prime")
else:
   print("not prime")