package Merge;

public class Code {
    // Hàm này để sắp xếp và kiểm tra mảng được đưa vào
    static void mergeSort(int[] arr) {
        //Kiểm tra mảng
        if ( arr == null ||  arr.length < 2) {
            return;
        }
        int n = arr.length; 
        mergeSort(arr, 0, n - 1);
    }
    //Hàm dùng để chia nhỏ các phần tử thành các phần nhỏ 
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + ( right - left) / 2;//lấy giá trị ở giữa left và right
            mergeSort(arr, left, mid); //Chia thành mảng bên trái lấy cả giá trị mid
            mergeSort(arr, mid + 1, right); //chia thành mảng bên phải
            merge(arr, left, mid, right);  //trộn các mảng   
        }
    }
    //Hàm trộn
    private static void merge(int[] arr, int left,int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Khởi tạo mảng trái phải tạm thời
        int[] L = new int[n1];
        int[] R = new int[n2];

        //Ghi vào mảng
        for ( int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for ( int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;//khởi tạo biến cho vòng While
        int k = left;//Biến k để ghi giá trị vào mảng chính

        
        /*kiểm tra đồng thời điều kiện để so sánh giá trị từ mảng trái và phải */
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {//Mảng trái nhỏ hơn thì ghi giá trị vào mảng tại k
                arr[k] = L[i];
                i++; //tăng i để loại bỏ phần tử đã thêm vào mảng
            } else {
                arr[k] = R[j];
                j++;
            }
            k++; //tăng k để thêm các phần tử
        }

        while ( i < n1 ) { //thêm phần tử còn sót bên trái
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while ( j < n2 ) { //thêm phần tử còn sót bên phải
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Array before sorting: " + java.util.Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Array after sorting: " + java.util.Arrays.toString(arr));
    }
}
