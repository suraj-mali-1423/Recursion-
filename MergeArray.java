public class MergeArray {
     public static void Merge( int [] a , int [] b , int [] arr ){
//         int [] arr = new int[a.length + b.length];
         int n = arr.length;
         int i = 0 , j = 0 , k = 0;
         while( a.length > i &&  b.length > j ){
             if(a[i] >= b[j]){
                 arr[k++] = b[j++];
             }
             else{
                 arr[k++] = a[i++];
             }
         }

         while(a.length > i ){
             arr[k++] = a[i++];
         }
         while(b.length > j ){
             arr[k++] = b[j++];
         }

     }

     public static void MergeTwo( int [] arr ){
         int n = arr.length;
         if( n == 1)return;
         int [] a  = new int[n/2];
         int [] b = new int[n-n/2];
         for ( int i = 0 ; i  < n/2 ; i++){
             a[i] = arr[i];
         }
         for ( int i = 0 ; i  < (n-n/2) ; i++){
             b[i] = arr[i+n/2];
         }
         MergeTwo(a);
         MergeTwo(b);

         Merge(a , b , arr);

     }
    public static void main(String[] args) {
             int [] a = { 10, 3 ,5 ,7 ,9 , 1 ,2,4,6};

             MergeTwo(a);
        for ( int x  : a ){
            System.out.print(x +" ");
        }
    }
}
