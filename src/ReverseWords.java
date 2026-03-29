 import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine().trim();
        String[] words = S.split("\\s+");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) {
                result += " ";
            }
        }

        System.out.println(result);
    }
}
    

