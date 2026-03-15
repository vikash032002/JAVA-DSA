public class HouseRobber {
public static int f(int[] arr,int idx) {
        if(idx>=arr.length) return 0;
        return Math.max((arr[idx]+f(arr,idx+2)),(0+f(arr,idx+1)));
    }
    public static void main(String[] args) {
        int[] arr={2,7,9,3,1};
        System.out.println("Max Rob: "+f(arr,0));
    }
}
