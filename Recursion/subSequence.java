public class subSequence {
    public static void f(String s,int idx,String output) {
        if(idx>=s.length()){
            System.out.println("["+output+"]");
            return;
        }
        f(s,idx+1,output+s.charAt(idx));
        f(s,idx+1,output);
    }
    public static void main(String[] args) {
        f("code",0,"");
    }
}
