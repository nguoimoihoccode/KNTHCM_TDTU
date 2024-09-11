import java.util.*;

class Cau1_2024 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        int n = 9;
        // for(int i = 0 ; i < 10 ; i++) {
        //     int a = count(i);
        //     System.out.println(a);
        // }
    }

    public static int count(int n) {
    if (n == 0) {
        return 1;
    } 
    else {
        int temp = 2 * count(n - 1);
        return temp;
    }
}
}

// cho f(x) = 1 khi x = 0, 