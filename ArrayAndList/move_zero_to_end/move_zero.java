package ArrayAndList.move_zero_to_end;

public class move_zero {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,3,4};
        int n=arr.length;

        int index=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }

        }
        for(int i=index;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
    }
    
}
