public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k=-10;
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        for(int i=0 ; i<k;i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }

        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
