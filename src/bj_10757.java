import java.math.BigInteger;
import java.util.Scanner;

public class bj_10757 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BigInteger A = new BigInteger(scan.next());
        BigInteger B = new BigInteger(scan.next());
        System.out.println(A.add(B));
    }
}
