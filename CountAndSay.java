public class CountAndSay {
    public static String CountSay( int n ){
        if( n == 1 ) return "1";


        String s = CountSay(n-1) +"@";
        // Modify
        String ans = "";
        int i = 0 , j = 0 ;

        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j))j++;
            else{
                int len  = j - i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
         String ans = CountSay(5);
        System.out.print("\n"+ans);
    }
}
