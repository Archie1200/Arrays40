public class stockBuySell {
    public static void main(String[] args) {
        int arr[]={100,180,260,310,40,535,695};
        maxProfit(arr);
    }
    public static void maxProfit(int[] arr){
        int p=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i])
                p+=arr[i+1]-arr[i];
        }
        System.out.println(p);
    }
}
//TC:O(n)
//SC:O(1)