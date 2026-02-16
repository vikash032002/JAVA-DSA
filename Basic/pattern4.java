package Basic;
public class pattern4 {
    public static void main(String[] args) {
        int num = 5;
        int spaces=num/2;
        int stars = 1;
        for(int row = 1; row<=num;row++) {
            for(int j=1; j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int i=1; i<=stars;i++) {
                System.out.print("*");
            }

            System.out.println("");
            if(row<=num/2) {
                spaces--;
                stars+=2;
            } else {
                spaces++;
                stars-=2;
            }
        }
    }    
}
