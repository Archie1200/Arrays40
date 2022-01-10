import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scan.nextInt();
        fact(n);
    }
    public static void fact(int n){
        BigInteger f= BigInteger.ONE;
        for(int i=2;i<=n;i++){
            f=f.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(f);
    }
}
