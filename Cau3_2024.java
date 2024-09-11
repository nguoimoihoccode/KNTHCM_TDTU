import java.util.*;

class Cau3_2024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i ++) {
            arr[i] = scanner.nextInt();
        }
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int bubbleSort(int[] arr) {
        for(int i = 0 ; i < arr.length - 1 ; i ++) {
            for( int j = arr.length - 1 ; j > i ; j -- ) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return -1;
    }
}