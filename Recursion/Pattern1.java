public class Pattern1 {
    // public static void printPattern(int n) {
    //         if (n <= 0) {
    //         return;
    //     }
    //     System.out.print("* ");
    //     printPattern(n-1);
    //     return;
    // }
    // public static void f(int n,int totalStars){
    //     if(n<=0) return;
    //     printPattern(totalStars);
    //     System.out.println("");
    //     f(n-1,totalStars);
    //     return;
        
    // }
    // public static void main(String[] args) {
    //     f(6,6);
    // }
    public static void f(int row,int col, int n){
        if(row>n) return;
        if(col>n){
            System.out.println();
            f(row+1,1,n);
            return;
        }
        System.out.print("* ");
        f(row,col+1,n);
    }

    public static void main(String[] args) {
        f(1,1,5);
    }
}
