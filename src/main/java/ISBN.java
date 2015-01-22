import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * User: daniel.baker
 * Date: 1/19/15
 * Time: 2:35 PM
 */
public class ISBN {

    public static void main(String[] args) {
        String[] input;

        try {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine().replaceAll("[^0-9]", "").split("(?!^)");

            int total = 0;

            for (int x = input.length; x > 0; x--) {
                total += (Integer.valueOf(input[x-1]) * x);
            }

            String output = total % 11 == 0 ? "True!" : "False";
            System.out.println(output);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
