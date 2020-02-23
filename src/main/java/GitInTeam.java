import java.util.Scanner;

public class GitInTeam {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello Git In Team");

        System.out.println("Hello Paweł");

        System.out.print("Podaj tekst do sprawdzenia: ");
        String stringToCheck = scanner.nextLine();

        if (PalindromChecker.checkPalindrome(stringToCheck)){
            System.out.println("Jest.");
        }
        else{
            System.out.println("Nie jest!");
        }

    }
}
