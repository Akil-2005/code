let arr=[1,2,3,2,1,1,4,4,5];
let n=arr.length;

let res=[];
let size=0;

for(let i=0;i<n;i++){
    let found=false;
    for(let j=0;j<size;j++){
        if(arr[i]===res[j]){
            found =true;
            break;
        }
    }
    if(!found){
        res[size]=arr[i];
        size++;
    }


}
for(let i=0;i<size;i++){
    console.log(res[i]);
}
