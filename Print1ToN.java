import java.util.Scanner;

public class Print1ToN {
    public static void Print( int n ){
        int cnt = 0 ;
        if ( n == 0 ) return ;
        Print(n-1);
        System.out.print(n +" ");
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = Sc.nextInt();
        Print(n);
    }
}
