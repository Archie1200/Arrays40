import java.util.ArrayList;
import java.util.Iterator;

public class negativetoOneside {
    public static void main(String[] args) {
        int arr[]={1,-5,-6,2,10,18,-34,-9};
        show(arr);
    }
    /*public static void show(int arr[]){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) {
                a.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0)
               a.add(arr[i]);
        }
        System.out.println(a);
    }*/
    public static void show(int []arr){
        int j=0,i=0;
        while(j<arr.length){
            if(arr[j]>0)
                j++;
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }

        }
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }
}
