let arr=[1,2,3,4,5,7];
let n=arr.length;
let a=arr[n-1];

let total=a*(a+1)/2;
let sum=0;
for(let i=0;i<n;i++){
    sum=sum+arr[i];
}
let missed=total-sum;
console.log(missed);