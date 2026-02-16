
import java.util.ArrayList;


public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        //BruteForce approach
        // int[] arr1 = {2,3,4,5,6,8,9};
        // int[] arr2 = {2,4,7,9};
        // ArrayList<Integer> output=new ArrayList<>();
        // for(int i=0;i<arr1.length;i++) {
        //     for(int j=0;j<arr2.length;j++){
        //         if(arr1[i]==arr2[j]){
        //             output.add(arr2[j]);
        //         }
        //     }
        // }
        // for(int result:output) {
        //     System.out.print(result+" ");
        // }

        int[] one = {10,19,20,30,40,40,40,50};
        int[] two = {15,16,17,20,25,30,30,40};

        System.out.println(intersection(one,two));
    }

    public static ArrayList<Integer> intersection(int[] one,int[] two) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<one.length && j<two.length) {
            if(one[i]<two[j]){
                i++;
            } else if(one[i]>two[j]){
                j++;
            } else {
                ans.add(one[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
