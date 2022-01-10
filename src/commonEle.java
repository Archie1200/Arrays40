import java.util.*;
public class commonEle {
    public static void main(String[] args) {
        int arr1[]={1,5,10,20,40,80};
        int arr2[]={6,7,20,80,100};
        int arr3[]={3,4,15,20,30,70,80,120};
        common(arr1,arr2,arr3);
    }
    public static void common(int arr1[],int arr2[],int arr3[]){
        Set<Integer> set1=new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i< arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set1.contains(arr2[i]))
                a.add(arr2[i]);
        }
        for(int i=0;i<arr3.length;i++){
            if(a.contains(arr3[i]))
                b.add(arr3[i]);
        }
        System.out.println(b);
    }
}
