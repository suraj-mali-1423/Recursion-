import java.util.ArrayList;

public class Subset {

    static ArrayList<String>arr = new ArrayList<>();
    public static void PrintSubset( int i , String Str , String Ans){
        // BAse case
        if(i == Str.length()) {
            arr.add(Ans);
            return;
        }
        char Ch = Str.charAt(i);
        PrintSubset(i+1 , Str, Ans);
        PrintSubset(i+1 , Str , Ans+Ch );
    }
    public static void main(String[] args) {
        String Str = "ABC";
        arr = new ArrayList<>();
        PrintSubset(0, Str , "");
        System.out.println(arr);
    }
}
