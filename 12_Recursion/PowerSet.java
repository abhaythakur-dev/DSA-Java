public class PowerSet {
    public static void main(String[] args) {
      String s = "abc";
      subset("",s,0);

    }
    public static void subset(String ans,String s,int idx){
        if(idx==s.length()){

            System.out.println();

            System.out.print("Lexicographical Order = "+ans);

                return;

        }
        char ch = s.charAt(idx);
        subset(ans+ch,s,idx+1); // Pick
        subset(ans,s,idx+1); // Skip
    }
}
