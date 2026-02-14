import java.util.Scanner;
public class pattern2 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print * pattern");
        int num=input.nextInt();
        int stars =1;
        for(int row=1;row<=num;row++) {
            for(int col=1;col<=num-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=stars; col++) {
                System.out.print("*");
            }

            stars+=2;
            System.out.println("");
        }
   } 
}
