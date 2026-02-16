package Basic;
import java.util.Scanner;
public class sumOfNaturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Natural number upto which you want to add");
        int num = input.nextInt();
        int sum = 0;
        for(int i=1; i<=num ; i++){
            sum +=i;
        }

        System.out.println("Total : "+ sum);
    }
}
