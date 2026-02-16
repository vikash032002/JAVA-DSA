package Basic;
public class pattern5 {
    public static void main(String[] args) {
        int num = 4;
        int stars = 1;
        int spaces;

        for(int row=1; row<=num;row++) {
            for(int col=1;col<=2*num-1;col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
