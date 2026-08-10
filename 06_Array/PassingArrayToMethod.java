public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] x = { 34, 54, 18, 7 };
        System.out.println(x[3]);
        change(x);
        System.out.println(x[3]);
    }

    public static void change(int[] y) {
        y[3] = 17;
      

    }

}


    // Whenever we pass are array to method The array passed by reference