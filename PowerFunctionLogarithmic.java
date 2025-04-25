public class PowerFunctionLogarithmic {
    public static int Power1(int a , int b ){
        if( b == 0) return 1;
         int ans =  Power1 ( a , b/2) ;
          if( b % 2 == 0 ) return ans * ans;
          else return ans * ans * a;
    }
    public static void main(String[] args) {
        System.out.print(Power1(2 ,  4));
    }
}
//  a = 5 and  b = 4
/*
 i = 1 :
       5 * Power ( 5 , 2 ) + power( 5 ,4 )

 */