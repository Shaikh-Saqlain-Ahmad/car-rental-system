import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Customer {
    public String customerName;
    public String carModel;
    public String carNumber;
    public String carName;
    public char data;
}

class Rent extends Customer {
    public int days = 0;
    public int rentalFee = 0;

    public void inputData() {
        login();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t\t\t\tPlease Enter your Name: ");
        customerName = scanner.nextLine();
        System.out.println();

        do {
            System.out.println("\t\t\t\tPlease Select a Car");
            System.out.println("\t\t\t\tEnter 'A' for HONDA");
            System.out.println("\t\t\t\tEnter 'B' for TOYOTA");
            System.out.println("\t\t\t\tEnter 'C' for SUZUKI");
            System.out.println("\t\t\t\tEnter 'D' for KIA");
            System.out.println("\t\t\t\tEnter 'E' for CHANGAN");
            System.out.println();
            System.out.print("\t\t\t\tChoose a Car from the above options: ");
            carModel = scanner.nextLine();
            System.out.println("--------------------------------------------------------------------------");

            if ("A".equalsIgnoreCase(carModel)) {
                System.out.println("You have chosen HONDA");
                displayCarDetails("A.txt");
                sleep(2000);
            } else if ("B".equalsIgnoreCase(carModel)) {
                System.out.println("You have chosen TOYOTA");
                displayCarDetails("B.txt");
                sleep(2000);
            } else if ("C".equalsIgnoreCase(carModel)) {
                System.out.println("You have chosen SUZUKI");
                displayCarDetails("C.txt");
                sleep(2000);
            } else if ("D".equalsIgnoreCase(carModel)) {
                System.out.println("You have chosen KIA");
                displayCarDetails("D.txt");
                sleep(2000);
            } else if ("E".equalsIgnoreCase(carModel)) {
                System.out.println("You have chosen CHANGAN");
                displayCarDetails("E.txt");
                sleep(2000);
            } else {
                System.out.println("Invalid Car Model. Please try again!");
            }
        } while (!("A".equalsIgnoreCase(carModel) || "B".equalsIgnoreCase(carModel) || "C".equalsIgnoreCase(carModel)
                || "D".equalsIgnoreCase(carModel) || "E".equalsIgnoreCase(carModel)));

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Please provide the following information:");
        System.out.print("Number of days you wish to rent the car: ");
        days = scanner.nextInt();
        System.out.println();
    }

    public void calculate() {
        sleep(1000);
        clearScreen();
        System.out.println("Calculating rent. Please wait......");
        sleep(2000);

        if ("A".equalsIgnoreCase(carModel)) {
            rentalFee = days * 5000;
        } else if ("B".equalsIgnoreCase(carModel)) {
            rentalFee = days * 4000;
        } else if ("C".equalsIgnoreCase(carModel)) {
            rentalFee = days * 3000;
        } else if ("D".equalsIgnoreCase(carModel)) {
            rentalFee = days * 2000;
        } else if ("E".equalsIgnoreCase(carModel)) {
            rentalFee = days * 3500;
        }
    }

    public void displayCarDetails(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayInvoice() {
        System.out.println("\n\t\t                       Car Rental - Customer Invoice                  ");
        System.out.printf("\t\t\t| Invoice No. :%18s |%n", "SE-313");
        System.out.printf("\t\t\t| Customer Name:%18s |%n", customerName);
        number();
        formodel();
        System.out.printf("\t\t\t| Car Name:%22s |%n", carName);
        System.out.printf("\t\t\t| Car Number:%20s |%n", carNumber);
        System.out.printf("\t\t\t| Number of days :%18s |%n", days);
        System.out.printf("\t\t\t| Your Rental Amount is :%12s |%n", rentalFee);
        System.out.printf("\t\t\t| Advanced :%23s |%n", "0");
        System.out.println("\t\t\t ________________________________________________________\n");
        System.out.printf("\t\t\t| Total Rental Amount is :%14s  RS |%n", rentalFee);
        System.out.println("\t\t\t ________________________________________________________\n");
        System.out.println(" ");
        System.out.println("\t\t\tYou are advised to pay up the amount before the due date.");
        System.out.println("\t\t\tOtherwise penalty fee will be applied");

        int f;
        pause();
        clearScreen();

        try (BufferedReader reader = new BufferedReader(new FileReader("thanks.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void number() {
        switch (carModel.toUpperCase()) {
            case "A":
                carNumber = "AGY-625";
                break;
            case "B":
                carNumber = "TCF-101";
                break;
            case "C":
                carNumber = "AKW-518";
                break;
            case "D":
                carNumber = "CRZ-567";
                break;
            case "E":
                carNumber = "KJL-589";
                break;
        }
    }

    public void formodel() {
        switch (carModel.toUpperCase()) {
            case "A":
                carName = "HONDA";
                break;
            case "B":
                carName = "TOYOTA";
                break;
            case "C":
                carName = "SUZUKI";
                break;
            case "D":
                carName = "KIA";
                break;
            case "E":
                carName = "CHANGAN";
                break;
        }
    }

    public void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void login() {
        String pass = "";
        char ch;
        System.out.println("\n\n\t\t\t\t\t       CAR RENTAL SYSTEM \n\n");
        System.out.println("\n\t\t\t\t\t       PREPARED BY: \n\n");
        System.out.println("\n\n\t\t\t\t\t       MAQSOOD AHMED (SE-21040) & SHAIKH SAQLAIN AHMAD (SE-21037)\n\n");
        System.out.println("\n\n\t\t\t\t\t       SUBMITTED TO: \n\n");
        System.out.println("\n\t\t\t\t\t        PROFESSOR. MUSTAFA LATIF FMS(SE-313) \n\n");
        System.out.println("\t\t\t\t\t------------------------------");
        System.out.println("\n\t\t\t\t\t\t     LOGIN \n");
        System.out.println("\t\t\t\t\t------------------------------\n\n");
        System.out.print("\t\t\t\t\tEnter Password: ");
    
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        pass = pass + ch;

        if (pass.equals("s")) {
            System.out.println("\n\n\n\t\t\t\t\t\tAccess Granted! \n");
            pause();
            clearScreen();
        } else {
            System.out.println("\n\n\t\t\t\t\t\t\tAccess Aborted...\n\t\t\t\t\t\t\tPlease Try Again\n\n");
            pause();
            clearScreen();
            login();
        }
    }
}

class Welcome {
    public void welcomeMessage() {
        displayAsciiArt("welcome.txt");
        sleep(1000);
        System.out.println("\nStarting the program. Please wait...");
        sleep(1000);
        System.out.println("Loading up files...");
        sleep(1000);
        clearScreen();
    }

    public void displayAsciiArt(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

public class CarRentalSystem {
    //menu driven test class
    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        welcome.welcomeMessage();

        Scanner scanner = new Scanner(System.in);
        boolean exitProgram = false;

        while (!exitProgram) {
            System.out.println("1. Rent a Car");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Rent rent = new Rent();
                    rent.inputData();
                    rent.calculate();
                    rent.displayInvoice();
                    break;
                case 2:
                    System.out.println("Closing the program! Good bye :)");
                    exitProgram = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
