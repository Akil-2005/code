let arr=[1,2,3,4,5,6];
let n=arr.length;
let first=arr[0];
let second=arr[0];
for(let i=0;i<n;i++){
    if(arr[i]>first){
        second=first;
        first=arr[i];
    }
    else if(arr[i]>second && arr[i]!=first){
        second=arr[i];
    }
}
console.log(first);
console.log(second);