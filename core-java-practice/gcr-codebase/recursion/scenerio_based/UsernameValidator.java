import java.util.Scanner;

public class UsernameValidator {

    public static boolean isValid(String username, int index) {

        if (index == username.length()) {
            return true;
        }

        char ch = username.charAt(index);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValid(username, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.println(
                "Valid Username: "
                        + isValid(username, 0));

        sc.close();
    }
}
