let arr=[1,2,3,4,5];
let n=arr.length;
let k=3;

k=k%n;
for(let r=0;r<k;r++){
    let last=arr[n-1];
    for(let i=n-1;i>0;i--){
        arr[i]=arr[i-1];
    }
    arr[0]=last;
 
}
   for(let j=0;j<n;j++){
    console.log(arr[j]);

}