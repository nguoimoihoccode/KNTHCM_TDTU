import java.util.Scanner;

class Cau5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int c = findnumber(a);
        System.out.println(c);
    }

    public static int findnumber(int[] a) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique == true) {
                b += 1;
            }
        }
        return b;
    }
}
