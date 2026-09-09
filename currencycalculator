import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enkle faste kurser (kan oppdateres manuelt)
        // Basert på cirka verdier (USD som base)
        double usdToEur = 0.92;
        double usdToNok = 10.70;
        double usdToGbp = 0.79;
        double usdToSek = 10.50;

        System.out.println("=== Enkel Currency Converter ===");
        System.out.println("1. USD → EUR");
        System.out.println("2. USD → NOK");
        System.out.println("3. USD → GBP");
        System.out.println("4. USD → SEK");
        System.out.println("5. Avslutt");
        System.out.print("\nVelg et alternativ (1-5): ");

        int valg = scanner.nextInt();

        if (valg == 5) {
            System.out.println("Ha det!");
            scanner.close();
            return;
        }

        System.out.print("Skriv inn beløp i USD: ");
        double belop = scanner.nextDouble();

        double resultat = 0;
        String tilValuta = "";

        switch (valg) {
            case 1:
                resultat = belop * usdToEur;
                tilValuta = "EUR";
                break;
            case 2:
                resultat = belop * usdToNok;
                tilValuta = "NOK";
                break;
            case 3:
                resultat = belop * usdToGbp;
                tilValuta = "GBP";
                break;
            case 4:
                resultat = belop * usdToSek;
                tilValuta = "SEK";
                break;
            default:
                System.out.println("Ugyldig valg!");
                scanner.close();
                return;
        }

        System.out.printf("\n%.2f USD = %.2f %s\n", belop, resultat, tilValuta);

        scanner.close();
    }
}
