import java.util.ArrayList;
import java.util.Scanner;



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList<>();

        boolean finished = false;

        System.out.print("FAVORITTBIL-PROGRAM");
        System.out.print("Skriv inn bilmerker.");
        System.out.print("Programmet avsluttes når du skriver Tesla.");
        System.out.println();

        while (!finished) {

            System.out.print("Hva er ditt favorittbilmerke? ");
            String input = scan.nextLine();

            cars.add(input);

            switch (input.toLowerCase()) {

                case "tesla":
                    System.out.print("Tesla!");
                    finished = true;
                    break;

                case "bmw":
                    System.out.print("BMW er et populært valg!");
                    break;

                case "audi":
                    System.out.print("Audi er et bra valg!");
                    break;

                case "mercedes":
                    System.out.print("Mercedes!");
                    break;

                case "volvo":
                    System.out.print("Volvo er kjent for sikkerhet!");
                    break;

                default:
                    System.out.print("Interessant valg!");
                    break;
            }

            System.out.println();
        }

        System.out.print("=== RESULTAT ===");
        System.out.println("Du skrev inn følgende bilmerker:");

        for (String car : cars) {
            System.out.println("- " + car);
        }

        System.out.println();
        System.out.print("Antall bilmerker: " + cars.size());

        scan.close();
    }
