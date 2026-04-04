package ArrayAndList.second_largest_array;

public class second_largest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;

        int first=arr[0];
        int second=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];

            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println(first);
        System.out.print(second);
    }
}
