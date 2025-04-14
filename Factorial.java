import java.util.Scanner;

public class Factorial {
    public static int Factorial( int n ){
        // Base Case
        if( n == 1 ) return n;

        return Factorial(n-1) * n;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = Sc.nextInt();

        int Ans = Factorial(n);
        System.out.print("This is the Factorial value of the "+n+" : "+Ans);
    }
}
