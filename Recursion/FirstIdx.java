public class FirstIdx {
        public static int f(int[] arr,int idx,int x) {
            if(idx==arr.length) return -1;
           return (arr[idx]==x)?idx:f(arr,idx+1,x);
    }
    public static void main(String[] args) {
        int[] arr={20,15,-2,0,8,21,13,8,11};
        System.out.println("First Index of x: "+f(arr,0,8));
    }
}
