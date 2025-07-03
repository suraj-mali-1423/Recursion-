import java.util.Scanner;

public class HCFRecu {
    public static  int HCF ( int a  , int b){
        if(b%a == 0) return a;

        return HCF(b%a , a);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print(" A : ");
        int a = Sc.nextInt();

        System.out.print(" A : ");
        int b = Sc.nextInt();

        System.out.println("HCF IS : " + HCF( a , b));

        Sc.close();
    }
}
