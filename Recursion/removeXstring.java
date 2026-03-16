public class removeXstring {
    public static void f(String s,int idx) {
        if(idx>=s.length()) return;
        if(s.charAt(idx)!='x') {
            System.out.print(s.charAt(idx));
        }
        f(s,idx+1);
    }

    public static void main(String[] args) {
        f("afvdcvvwyuxxxexjrhxxbxxoeuoke",0);
    }
}
