public class BinaryString {
    public static void Binary( String s , int n  ){
        int x = s.length() ;




        if( s.length() == n){
            System.out.println(s);
            return;
        }

        if(x  == 0 || s.charAt(x-1) == '0'){
            Binary(s+0 , n );
            Binary(s+1 , n );
        }
        else  Binary(s+0 , n );
    }
    public static void main(String[] args) {
          int n = 3;
          Binary("" , n );
    }
}
