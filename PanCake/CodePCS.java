public class CodePCS {
    //Dao chieu tu vi tri dau den vi tri ket thuc
    static void flipArr(int arr[], int end) {
        int start = 0; 
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //Ham tim so lon nhat trong mang con lai
    static int findMaxIndex(int arr[], int n) {
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex =  i;
            }
        }
        return maxIndex;
    }

    static void pancakeSort(int arr[]) {
        int n = arr.length;
        for ( int i = n; i > 1; i--) {
            int maxIndex = findMaxIndex(arr, i);
            if ( maxIndex != i - 1) {
                flipArr(arr, maxIndex);
                flipArr(arr, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 10, 1, 12, 3, 2, 5, 6, 20, 4, 29};
        System.out.println("Mang ban dau: " + java.util.Arrays.toString(arr));
        pancakeSort(arr);
        System.out.println("Mang sau khi sap xep: " + java.util.Arrays.toString(arr));
    }
}
