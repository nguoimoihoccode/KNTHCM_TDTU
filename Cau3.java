import java.util.*;

public class Cau3 {
    public static void bubbleSort(int[] arr) {
        // int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    

                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort1(int[] arr) {
        for(int i = 0 ; i <arr.length - 1 ; i ++) {
            for( int j = arr.length - 1 ; j > i ; j -- ) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] arr) {
        for(int i = 0 ; i <arr.length - 1 ; i ++) {
            for( int j = arr.length - 1 ; j > i ; j -- ) {
                if(arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static List<Integer> findLIS(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        int[] prev = new int[n];
        Arrays.fill(lis, 1);
        Arrays.fill(prev, -1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    prev[i] = j;
                }
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (lis[i] > lis[maxIndex]) {
                maxIndex = i;
            }
        }

        List<Integer> lisSequence = new ArrayList<>();
        for (int i = maxIndex; i >= 0; i = prev[i]) {
            lisSequence.add(arr[i]);
            if (prev[i] == -1) break;
        }

        Collections.reverse(lisSequence);
        return lisSequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap ten");
        // String abc = scanner.nextLine();
        // System.out.print("Nhap n:");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i ++) {
            arr[i] = scanner.nextInt();
        }
        // bubbleSort(arr);
        // System.out.println("Sorted array: ");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        bubbleSort2(arr);
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }
    }
}
