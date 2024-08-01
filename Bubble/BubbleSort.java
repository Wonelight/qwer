package Bubble;

public class BubbleSort {
    static void bbSort(int[] arr) {
        int n = arr.length;
        for ( int i = 0; i < n - 1; i++) {
            System.out.println("Bước " + (i + 1) + ":");
            for ( int j = 0; j  < n -  i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(java.util.Arrays.toString(arr));
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 10, 20, 11, 12, 6,4,3,1,12,32,43,1,2,3,4,1,02,4,3, 7};
        System.out.println("Mảng ban đầu: " + java.util.Arrays.toString(arr));
        bbSort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + java.util.Arrays.toString(arr));
    }
}
