public class smallestSubarray {
    public static void main(String[] args) {

        int arr[] = {1,10,5,0,2,7};
        subArray(arr,7);
    }
    public static void subArray(int arr[],int sum){
        int i=0,j=0,x=0,min=Integer.MAX_VALUE;
        while(i<arr.length && j<arr.length){
            while(x<=sum &&j<arr.length){
                x+=arr[j];
                j++;
            }
            while(x>sum && i<arr.length){
                int ml=j-i;
                if(ml<min)
                    min=ml;
                x=x-arr[i];
                i++;
            }
        }
        System.out.println(min);
    }
}
