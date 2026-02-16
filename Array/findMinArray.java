public class findMinArray {
    public static void main(String[] args) {
        int[] arr = {6,8,3,5,2,7};
        int min = arr[0];
        int max = arr[0];
        for (int idx = 0; idx < arr.length; idx++) {
           if(min>arr[idx]){
            min=arr[idx];
           }
           if(max<arr[idx]){
            max=arr[idx];
           }
        }
        System.out.println("Min"+min);
        System.out.println("Max"+max);
    }
}
