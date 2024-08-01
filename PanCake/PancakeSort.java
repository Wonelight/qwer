public class PancakeSort {
    // Hàm để đảo ngược một dãy số từ vị trí đầu tiên đến vị trí end
    static void flip(int arr[], int end) {
        int start = 0;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Hàm tìm vị trí của phần tử lớn nhất trong mảng
    static int findMaxIndex(int arr[], int n) {
        int maxIndex = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Hàm thực hiện thuật toán Pancake Sort
    static void pancakeSort(int arr[]) {
        int n = arr.length;
        for (int currSize = n; currSize > 1; --currSize) {
            // Tìm vị trí của phần tử lớn nhất trong đoạn từ 0 đến currSize
            int maxIndex = findMaxIndex(arr, currSize);
            
            // Đảo ngược các phần tử từ 0 đến phần tử lớn nhất
            if (maxIndex != currSize - 1) {
                flip(arr, maxIndex);
                System.out.println("Bước " + (n - currSize + 1) + ": " + java.util.Arrays.toString(arr));
                
                // Đảo ngược toàn bộ dãy từ 0 đến currSize - 1
                flip(arr, currSize - 1);
                System.out.println("Bước " + (n - currSize + 2) + ": " + java.util.Arrays.toString(arr));
            }
        }
    }

    // Hàm main để kiểm tra
    public static void main(String args[]) {
        int arr[] = {2, 10, 20, 11, 12, 6, 7};
        System.out.println("Mảng ban đầu: " + java.util.Arrays.toString(arr));
        pancakeSort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + java.util.Arrays.toString(arr));
    }
}
