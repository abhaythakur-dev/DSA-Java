
public class FunctionCallingItself {
   public static void main(String[] args) {
    abhay(1);
   }
    public static void abhay(int n){
        if(n==11) return;
        System.out.println("Harsh");
        abhay(n+1);
    }
   } 

