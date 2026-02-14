
import java.util.*;

public class armstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check whether it is armstrong or not");
        int num = input.nextInt();
        String number = Integer.toString(num);
        int length = number.length();
        int output = 0, temp = num;
        while (temp != 0) {
            int n = temp % 10;
            output += Math.pow(n, length);
            temp /= 10;
        }
        System.out.println(output);
        if(num == output) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
