public class Stairpath {
    public static int Stair( int n ){
        if( n == 1 || n == 2 ) return n;

        return Stair(n-1) + Stair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Stair(6));
    }
}
