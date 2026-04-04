public class min_max {
    public static void main(String[] args) {
        int[] arr={12,34,21,1,34,2,111};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
            else if (arr[i]<min) min=arr[i];
        }
        System.out.println("max:"+max);
        System.out.print("min:"+min);
    }
    
}
