public class ArrayRecursive {
    public static void f(int[] arr,int idx) {
        if(idx<0) return;
        f(arr,idx-1);
        System.out.print(" "+arr[idx]);
    }
    public static void main(String[] args) {
          int[] arr = {10,7,23,35,20};
          f(arr,arr.length-1);
    }
}
