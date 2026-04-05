let s=" i love programming";
let n=s.length;

let word="";
let max_word="";
let max_len=0;

for(let i=0;i<n;i++){
    if(s[i]!==' '){
        word=word+s[i];
    }
    else{
        if(word.length>max_len){
            max_len=word.length;
            max_word=word;
        }
        word=" ";
    }
}

if(word.length>max_len){
    max_word=word;
}
console.log(max_word);