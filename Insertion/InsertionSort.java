package Insertion;

public class InsertionSort {
    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i;
            System.out.println("Bước " + i + ": ");
            System.out.println("Giá trị key: " + key);
            while (j > 0 && arr[j - 1] > key) {
                arr[j] = arr[j - 1];
                j = j - 1;
                System.out.println("Di chuyển phần tử " + arr[j] + " sang phải");
            }
            arr[j] = key;
            System.out.println("Chèn key = " + key + " vào vị trí j = " + j);
            System.out.println("Mảng sau bước " + i + ": " + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 4, 2};
        int size = arr.length;
        System.out.println("Dãy trước khi sắp xếp " + java.util.Arrays.toString(arr));
        insertionSort(arr, size);
        System.out.println("Dãy sau khi sắp xếp " + java.util.Arrays.toString(arr));
    }
}
