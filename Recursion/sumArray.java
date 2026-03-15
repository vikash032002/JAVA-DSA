public class sumArray {
    public static int f(int[] arr,int idx) {
        if(idx==arr.length-1) return arr[idx];
        return arr[idx]+f(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr={20,15,-2,0,8,21,11};
        System.out.println("Sum: "+f(arr,0));
    }
}
