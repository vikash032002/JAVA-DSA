public class swapArray {
    public static void main(String[] args) {
        int[] arr = {12,4,5,8,20};
        int i=1,j=3;
        System.out.println(arr[i]+" "+arr[j]);
        swapArr(arr,i,j);
        System.out.println("Array after swapping"+arr[i] + " " + arr[j]);
    }

    public static void swapArr(int[] a,int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}