import java.util.ArrayList;
import java.util.List;

public class GeneratePAra {
    public static List<String> Ans;
    public static void Print(int open , int close , int n , String s){
        if(s.length() == (2*n)){
            System.out.println(s);
            return;
        }

        if(open < n ) Print(open+1 , close , n , s+"(");
        if(close < open ) Print( open , close + 1 , n , s+")");

    }

    public static void Helper(int open , int close , int n , String s){
         if(s.length() == (2*n)){
             Ans.add(s);
             return;
         }
        if(open < n )  Helper(open+1 , close , n , s+"(");
        if(close < open ) Helper(open , close+1 , n , s+")");
    }
    public static List<String> GeneratePara(int n ){
         Ans = new ArrayList<>();
         Helper(0 , 0  , n , "");

         return Ans;
    }
    public static void main(String[] args) {
        List<String> Answer = GeneratePara(3);
        System.out.println(Answer);
    }
}
