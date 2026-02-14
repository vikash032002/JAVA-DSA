// 7
// *
// **
// ***
// ****
// ***
// **
// *
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter odd number for pattern");
        int num = input.nextInt();
        // for(int row=0; row<=num/2;row++) {
        //     for(int j1=0; j1<=row; j1++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for(int row=num/2; row>=1;row--) {
        //     for(int j1=1; j1<=row; j1++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        int stars = 1; 

        for(int row=1; row<=num;row++) {
            for(int j=1 ; j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println("");

            if(row<=num/2) {
                stars++;
            } else {
                stars--;
            }
        }
    }
}
