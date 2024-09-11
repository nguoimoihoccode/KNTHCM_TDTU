import java.util.ArrayList;
import java.util.List;

public class cau31 {

    static int reverseInteger(int number) {
        String resultString = "";
        String numberString = String.valueOf(number);

        for (int i = numberString.length() - 1; i >= 0; i--) {
            resultString += numberString.charAt(i);
        }

        return Integer.parseInt(resultString);
    }

    static void getPermutations(String targetString, String result, List<String> permutations) {
        if (targetString.length() == 0) {
            permutations.add(result);
            return;
        }

        for (int i = 0; i < targetString.length(); i++) {
            char character = targetString.charAt(i);
            String restOfString = targetString.substring(0, i) + targetString.substring(i + 1);
            getPermutations(restOfString, result + character, permutations);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int number = Integer.parseInt(args[0]);
            int reverseNumber = reverseInteger(number);
            System.out.println(number - reverseNumber);

            List<String> permutations = new ArrayList<>();
            getPermutations(String.valueOf(number), "", permutations);

            String permutationsResult = String.join(" ", permutations);
            System.out.println(permutationsResult);
        } else {
            System.out.println("Please provide an integer as a command line argument.");
        }
    }
}
