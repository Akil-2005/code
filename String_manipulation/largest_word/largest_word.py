str=input("enter:")
n=len(str)

word=""
max_word=""
max_len=0

for i in range(n):
    if(str[i]!=' '):
        word=word+str[i]
    else:
        if(len(word)>max_len):
            max_len=len(word)
            max_word=word
        word=" "
if(len(word)>max_len):
    max_word=word
print(max_word)