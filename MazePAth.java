import java.util.Scanner;

public class MazePAth {


    public static int  Maze( int row  , int col){
        if(row == 1 || col == 1) return 1;
        int rightway = Maze(row,col-1);
        int  downway = Maze(row-1,col);

        return rightway + downway;
    }

    public static  int Maze2( int row , int col , int m , int n) {
        if (col == n || row == m){
            return 1;
        }
        int rightway = Maze2(row , col + 1 , m , n );
        int down = Maze2(row+1 , col , m , n);
        return rightway + down;
    }


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the m : ");
        int n = Sc.nextInt();
        System.out.print("Enter the n : " );
        int m = Sc.nextInt();

        System.out.println(Maze( m , n ));
        System.out.println(Maze2(1,1,m,n));
    }
}
