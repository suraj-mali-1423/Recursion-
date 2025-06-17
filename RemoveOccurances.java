import java.io.PrintStream;

public class RemoveOccurances {
    static void PrintString(String Str, int i){
         if(Str.length() == i )return;

        System.out.print(Str.charAt(i));

        PrintString(Str , i+1);
    }
    public static void main(String[] args) {
        String Str = "Suraj";
        PrintString(Str , 0);

    }
}
