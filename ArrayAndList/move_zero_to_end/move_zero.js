let arr=[1,0,3,2,0];
let n=arr.length;

let index=0;
for(let i=0;i< n;i++){
    if(arr[i]!=0){
        arr[index]=arr[i];
        index++;
    }

}
for(let i=index;i<n;i++){
    arr[i]=0;
}

 console.log(arr);
