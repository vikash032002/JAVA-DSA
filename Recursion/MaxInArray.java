public class MaxInArray {
    public static int f(int[] arr,int idx) {
        if(idx==arr.length-1) return arr[idx];
        return Math.max(arr[idx],f(arr,idx+1));
    }
    public static void main(String[] args) {
        int[] arr={20,15,-2,0,8,21,11};
        System.out.println("Max: "+f(arr,0));
    }
}
