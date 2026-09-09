import java.util.Scanner;

public class EnkelSikkerhet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn et passord: ");
        String passord = scanner.nextLine();

        if (passord.length() < 8) {
            System.out.println("For kort! Bruk minst 8 tegn.");
        } else if (!passord.matches(".*[0-9].*")) {
            System.out.println("Mangler tall. Legg til et tall.");
        } else if (!passord.matches(".*[A-Z].*")) {
            System.out.println("Mangler stor bokstav.");
        } else {
            System.out.println("Passordet ser greit ut!");
        }

        scanner.close();
    }
}
