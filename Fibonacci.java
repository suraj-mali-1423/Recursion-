public class Fibonacci {
    public static int Fibbo ( int n ){
        if( n == 0 ||  n == 1 || n == 2) return 1; // Another one base case is " n <= 1 "
        return Fibbo(n-1) + Fibbo(n-2);
    }
    public static void main(String[] args) {
        System.out.print(Fibbo(11));
    }
}
