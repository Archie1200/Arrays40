public class LargestSumSubarray{
    public static void main(String[] args) {
        int [] arr={-6,7,1,-2,-10,-3,-2,6};
        sumSubArray(arr);
    }
    public static void sumSubArray(int [] arr){
        int x=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x+arr[i])
                x=arr[i];
            else
                x=x+arr[i];
            if(x>max)
                max=x;
        }
        System.out.println(max);
    }
}
