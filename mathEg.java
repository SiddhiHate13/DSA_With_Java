import java.util.*;

public class mathEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1: " );
        int num1 = sc.nextInt() ;
        System.out.println("Enter Num2: " );
        int num2 = sc.nextInt() ;
        int gcd = 0;
        for (int i = 1 ; i <= Math.min(num1, num2) ; i++) {
            if(num1 % i == 0 && num2 % i == 0)
                gcd = i;
            
        }
        System.out.println("Gcd is "+ gcd);

    }
}