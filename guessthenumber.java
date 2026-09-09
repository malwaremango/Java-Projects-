import java.util.Scanner;
import java.util.Random;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int hemmeligTall = random.nextInt(100) + 1; // Tall mellom 1 og 100
        int gjetting;
        int antallForsok = 0;
        boolean harGjettet = false;

        System.out.println("=== Velkommen til Tallgjetting! ===");
        System.out.println("Jeg tenker på et tall mellom 1 og 100.");
        System.out.println("Kan du gjette det?\n");

        while (!harGjettet) {
            System.out.print("Skriv inn ditt gjett: ");
            gjetting = scanner.nextInt();
            antallForsok++;

            if (gjetting < hemmeligTall) {
                System.out.println("For lavt! Prøv igjen.\n");
            } else if (gjetting > hemmeligTall) {
                System.out.println("For høyt! Prøv igjen.\n");
            } else {
                System.out.println("\nGratulerer! Du gjettet riktig!");
                System.out.println("Tallet var: " + hemmeligTall);
                System.out.println("Du brukte " + antallForsok + " forsøk.");
                harGjettet = true;
            }
        }

        scanner.close();
    }

