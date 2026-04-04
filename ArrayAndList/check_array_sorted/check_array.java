package ArrayAndList.check_array_sorted;

public class check_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,8,7};
        int n=arr.length;
        boolean is_sorted=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                is_sorted=false;
                break;

            }
            

        }
        if(is_sorted) System.out.print("sorted");
        else System.out.print("unsorted");
    }
}
