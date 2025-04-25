public class Power {
    public static int Power( int a , int b ){
        if(b == 0) return 1;

        return a * Power(a , b - 1);
    }
    public static void main(String[] args) {
        System.out.print(3 + " Rest to " + 5 + " IS : " + Power(3, 5));
    }
}
