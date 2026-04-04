let n=5;
let isprime=true;
while(n<=1){
    isprime=false;
}
for(let i=2;i<=n/2;i++){
    if(n%i==0){
        isprime=false;
        break;
    }

}
if(isprime){
    console.log("prime");

}
else{
    console.log("not prime");
}