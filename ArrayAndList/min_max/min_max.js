let arr=[12,32,4,5,3,111];
let max=arr[0];
let min=arr[0];
for(let i=0;i<arr.length;i++){
    if(arr[i]>max) max=arr[i];
    else if(arr[i]<min) min=arr[i];
}
console.log("max:",max);
console.log("min;",min);