import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = "admin";
        int password = 1234;
        int attempts = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print("Username: ");
            String user = in.nextLine();
            System.out.print("Password: ");
            int pass = in.nextInt();
            in.nextLine();
            if (user.equals(username) && pass == password) {
                System.out.println("Login successful!");
                System.out.println("Welcome, admin!");
                break;
            }else{
                System.out.println("Invalid username or password!");
                --attempts;
                System.out.println("Attempts remaining: " + attempts);
            }
            if(attempts == 0) {
                System.out.println();
                System.out.println("Account locked!, try again later");
            }
        }
    }
}