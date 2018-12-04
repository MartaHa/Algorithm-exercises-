public class Task4 {

    public static int findEvenIndex(int[] arr) {
        if (arr.equals(0)) {
            return 0;
        } else {
            int evenIndex = -1;

            for (int i=0; i< arr.length;i++){
                int sumFromLeft = 0;
                int sumFromRight = 0;
                for (int j=0;j<i; j++){
                    sumFromLeft += arr[j];
                }
                for (int k=arr.length-1; k>i; k--){
                    sumFromRight += arr[k];
                }
                if(sumFromLeft == sumFromRight){
                    evenIndex = i;
                    break;
                }
            }
            return evenIndex;
        }
    }


    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(findEvenIndex(arr));
    }
}