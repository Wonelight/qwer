package Merge;

import java.util.Arrays;

public class MergeSort {
    
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
    }
    
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        // In từng bước của quá trình sắp xếp
        System.out.println("Left Array: " + Arrays.toString(L));
        System.out.println("Right Array: " + Arrays.toString(R));
        System.out.println("Merged Array: " + Arrays.toString(arr));
        System.out.println();
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7, 1, 0 ,2, 4};
        System.out.println("Array before sorting:");
        printArray(arr);
        
        mergeSort(arr);
        
        System.out.println("Array after sorting:");
        printArray(arr);
    }
}
