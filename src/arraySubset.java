import java.util.HashSet;

public class arraySubset {
    public static void main(String[] args) {
        int arr1[]={1,3,2,4,6,7};
        int arr2[]={2,3,4,2,6};
        checkSubset(arr1,arr2);
    }
    public static void checkSubset(int arr1[],int arr2[]){
        HashSet<Integer> set1= new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        boolean flag=true;
        for(int i=0;i<arr2.length;i++){
            if(!set1.contains(arr2[i])) {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
