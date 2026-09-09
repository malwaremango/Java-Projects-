import java.util.Scanner;

public class EnkelSikkerhet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passord;
        boolean erSterkt = false;

        while (!erSterkt) {
            System.out.print("Skriv inn et passord: ");
            passord = scanner.nextLine();

            if (passord.length() < 8) {
                System.out.println("For kort! Bruk minst 8 tegn.\n");
            } else if (!passord.matches(".*[0-9].*")) {
                System.out.println("Mangler tall. Legg til et tall.\n");
            } else if (!passord.matches(".*[A-Z].*")) {
                System.out.println("Mangler stor bokstav.\n");
            } else {
                System.out.println("Passordet ser greit ut!");
                erSterkt = true;
            }
        }

        scanner.close();
    }
}
