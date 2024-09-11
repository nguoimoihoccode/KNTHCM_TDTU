import java.util.*;

class prime{
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        else {
            for(int i = 2; i < n ; i++) {
                if(n%i == 0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(isPrime(n)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}