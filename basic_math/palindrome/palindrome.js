/*let n="121"
let rev=n.split('').reverse().join('');
if(n===rev){console.log("palindrome");}
else{console.log("not palindrome")}

//another methode

let n="121";
let left=0;
let right=n.length-1;
let ispalindrome=true;
while(left<right){
    if(n[left]!=n[right]){
        ispalindrome=false;
        break;
    }
    left++;
    right--;

}
if (ispalindrome){
    console.log("palinfrome");
}
else{
    console.log("not palindrome");
}*/

//another method

let n="121";
let rev="";
for(let i=0;i<n.length;i++){
    rev=n[i]+rev;
}
if(rev===n){
    console.log("palinfrome");
}
else{
    console.log("not a palindrome");
}