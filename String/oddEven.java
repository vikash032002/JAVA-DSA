//input cDEGmN - output dCFFnM
public class oddEven {
    public static void main(String[] args) {
        String str="cDEGmN";
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0;i<sb.length();i++) {
            char ch = sb.charAt(i);
            if(i%2==0){
                ch = (char)(ch+1);
                sb.setCharAt(i, ch);
            } else {
                ch = (char)(ch-1);
                sb.setCharAt(i, ch);
            }
        }
        sb.toString();
        System.out.println(sb);
    }
}