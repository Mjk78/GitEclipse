
import java.util.Scanner;

 

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String answer = "Tiina";

        int guesses = 0;

       

        String guess = "";

       

        do {

            System.out.print("Arvaa kuka olen: ");

            guess = scanner.nextLine();

           

            if (guess.equalsIgnoreCase(answer)) {

                System.out.println("Onneksi olkoon, arvasit oikein!");

                break;

            } else if (guess.equalsIgnoreCase("loppu")) {

                System.out.println("Peli päättyi.");

                break;

            } else {

                System.out.println("Väärin arvattu. Yritä vielä uudestaan.");

                guesses++;

            }

        } while (true);

       

        System.out.println("Loistavaa ratkaisit tehtävä, arvasit " + guesses + " kertaa.");

    }

}
