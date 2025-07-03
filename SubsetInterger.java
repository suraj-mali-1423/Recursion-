import jdk.jshell.ImportSnippet;

import java.util.ArrayList;
import java.util.List;

public class SubsetInterger {
    static List<List<Integer>> Arr = new ArrayList<>();

//    public static  void Display(List<Integer> Ans){
////         for( int i = 0 ; i < Ans.size() ; i++ ){
////             System.out.print(Ans.get(i) +" ");
////         }
//        System.out.println(Ans);
//    }
    public static void Helper( int i , int [] nums , ArrayList<Integer>Ans){

        if ( i == nums.length){
            ArrayList<Integer>list =  new ArrayList<>();
            for( int j = 0; j < Ans.size(); j++ ){
                list.add(Ans.get(j));
            }

            Arr.add(list);
            return;
        }
        Helper(i+1, nums , Ans );
        Ans.add(nums[i]);
        Helper(i+1, nums , Ans );
        Ans.remove(Ans.size() - 1);
    }
    public static List<List<Integer>> Subset( int [] nums){
        Arr = new ArrayList<>();

        ArrayList<Integer>Ans =  new ArrayList<>();
        Helper(0 , nums , Ans);
        return Arr;
    }
    public static void main(String[] args) {
        int [] nums = { 1 , 2 , 3 };
        List<List<Integer>> Answer = Subset(nums);

        System.out.println(Answer);
    }
}
