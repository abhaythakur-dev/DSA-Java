public class OnlyOddNoSort {
    public static void main(String[] args) {
        int [] arr = {2,4,5,3,7,8,9,10};
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2!=0){
                for(int j=i+1; j<arr.length;j++){
                    if(arr[j]%2!=0 && arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for(int num : arr)
            System.out.println("Only Odd No is Sorted = "+num);
    }
}
