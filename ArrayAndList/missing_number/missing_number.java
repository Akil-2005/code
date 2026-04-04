package ArrayAndList.missing_number;

public class missing_number {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7};
        int n=arr.length;
        int b=arr[n-1];

        int total=b*(b+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            
        }
        int miss=total-sum;
        System.out.print(miss);

    }
}
