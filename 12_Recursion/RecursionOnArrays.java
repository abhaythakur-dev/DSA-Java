
public class RecursionOnArrays {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        recPrint(arr,0);
        int tar = 7;
       System.out.println(exists(arr,tar,0));

    }
    public static boolean exists(int[] arr,int tar,int idx){
        if(idx==arr.length) return false;
        if(arr[idx] == tar) return true;
        return exists(arr,tar,idx+1);

    }

    public static void recPrint(int[]arr,int idx){
       if(idx==arr.length) return;
       System.out.print(arr[idx]+" ");
        recPrint(arr,idx+1);



    }
}
