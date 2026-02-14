import java.util.Scanner;
public class threeIntegerMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three Digit");
        int a= input.nextInt();
        int b = input.nextInt();
        int c =input.nextInt();
        
        if(a>b && a>c) {
            System.out.println(a);
        } else if(b>a && b>c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        
    }
}