let arr=[1,2,3,4,5,7,8,10,9];
let n=arr.length;

let is_sorted=true;
for(let i=0;i<n-1;i++){
    if(arr[i]>arr[i+1]){
        is_sorted=false;
        break
    }

}
if(is_sorted) console.log("sorted");
else console.log("not sroted");