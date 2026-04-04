package ArrayAndList.remove_duplicate_array;

public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,6,4,3,4};
        int n=arr.length;

        int [] res=new int[n];
        int size=0;

        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<size;j++){
                if(arr[i]==res[j]){
                    found=true;
                    break;

                }
            }
                if(!found){
                    res[size]=arr[i];
                    size++;
                }
            }
        
            for(int i=0;i<size;i++){
                System.out.print(res[i]);
            }
        
    }
    
}
