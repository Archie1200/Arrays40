public class palindromicArray {
    public static void main(String[] args) {
        int arr[]={1,4,0,9,13,1};
        count(arr);
    }
    public static void count(int arr[]){
        int c=0;
        for(int i=0,j=arr.length-1;i<=j;){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]>arr[j])
            {
                j--;
                arr[j]+=arr[j+1];
                c++;
            }
            else {
                i++;
                arr[i]+=arr[i-1];
                c++;
            }
        }
        System.out.println(c);
    }
}
