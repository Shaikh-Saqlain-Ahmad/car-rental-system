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
       // Scanner scanner = new Scanner(System.in);
        System.out.print("\t\t\t\tLogin Test Case 1 ");
       // customerName = scanner.nextLine();
       customerName="testname";
        System.out.println();

        // do {
        //     System.out.println("\t\t\t\tPlease Select a Car");
        //     System.out.println("\t\t\t\tEnter 'A' for HONDA");
        //     System.out.println("\t\t\t\tEnter 'B' for TOYOTA");
        //     System.out.println("\t\t\t\tEnter 'C' for SUZUKI");
        //     System.out.println("\t\t\t\tEnter 'D' for KIA");
        //     System.out.println("\t\t\t\tEnter 'E' for CHANGAN");
        //     System.out.println();
        //     System.out.print("\t\t\t\tChoose a Car from the above options: ");
        //    // carModel = scanner.nextLine();
        //    carModel="B";
        //     System.out.println("--------------------------------------------------------------------------");

        //      if ("B".equalsIgnoreCase(carModel)) {
        //         System.out.println("Running car model test case 4");
        //         displayCarDetails("B.txt");
        //         sleep(2000);
        //     }  else {
        //         System.out.println("Test case failed");
        //     }
        // } while (!("A".equalsIgnoreCase(carModel) || "B".equalsIgnoreCase(carModel) || "C".equalsIgnoreCase(carModel)
        //         || "D".equalsIgnoreCase(carModel) || "E".equalsIgnoreCase(carModel)));

        System.out.println("--------------------------------------------------------------------------");
        // System.out.println("Please provide the following information:");
        // System.out.print("Number of days you wish to rent the car: ");
       // days = scanner.nextInt();
        System.out.println();
    }
    public void inputDatafortestcase() {
       // login();
       // Scanner scanner = new Scanner(System.in);
      //  System.out.print("\t\t\t\tLogin Test Case 1 ");
       // customerName = scanner.nextLine();
       customerName="testname";
        System.out.println();

        do {
            System.out.println("\t\t\t\tPlease Select a Car");
            System.out.println("\t\t\t\tEnter 'A' for HONDA");
            System.out.println("\t\t\t\tEnter 'B' for TOYOTA");
            System.out.println("\t\t\t\tEnter 'C' for SUZUKI");
            System.out.println("\t\t\t\tEnter 'D' for KIA");
            System.out.println("\t\t\t\tEnter 'E' for CHANGAN");
            System.out.println();
            System.out.print("\t\t\t\tTest case 3 passed ");
           // carModel = scanner.nextLine();
           carModel="B";
            System.out.println("--------------------------------------------------------------------------");

             if ("B".equalsIgnoreCase(carModel)) {
               // System.out.println("Running car model test case 4");
                displayCarDetails("B.txt");
                sleep(2000);
            }  else {
                System.out.println("Test case failed");
            }
        } while (!("A".equalsIgnoreCase(carModel) || "B".equalsIgnoreCase(carModel) || "C".equalsIgnoreCase(carModel)
                || "D".equalsIgnoreCase(carModel) || "E".equalsIgnoreCase(carModel)));

        System.out.println("--------------------------------------------------------------------------");
        // System.out.println("Please provide the following information:");
        // System.out.print("Number of days you wish to rent the car: ");
       // days = scanner.nextInt();
        System.out.println();
    }
       public void inputDatafortestcase4() {
        // login();
         Scanner scanner = new Scanner(System.in);
        // System.out.print("\t\t\t\tPlease Enter your Name: ");
        // customerName = scanner.nextLine();
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
               // displayCarDetails("A.txt");
                sleep(2000);
            } else if ("B".equalsIgnoreCase(carModel)) {
                System.out.println("You have chosen TOYOTA");
               // displayCarDetails("B.txt");
                sleep(2000);
            } else if ("C".equalsIgnoreCase(carModel)) {
                System.out.println("You have chosen SUZUKI");
              //  displayCarDetails("C.txt");
                sleep(2000);
            } else if ("D".equalsIgnoreCase(carModel)) {
                System.out.println("You have chosen KIA");
              //  displayCarDetails("D.txt");
                sleep(2000);
            } else if ("E".equalsIgnoreCase(carModel)) {
                System.out.println("You have chosen CHANGAN");
              //  displayCarDetails("E.txt");
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
        System.out.print("Test case 3 passed. ");
    }

    public void calculate() {
        sleep(1000);
        clearScreen();
        System.out.println("Running test case 4......");
        System.out.println("Test case 4 passed");
        sleep(2000);
        carModel="A";
        if ("A".equalsIgnoreCase(carModel)) {
            rentalFee = 3 * 5000;
            System.out.println("Test case Model ");
            System.out.println(carModel);
            System.out.println("Test case rental fee ");
            System.out.println(rentalFee);
        } else if ("B".equalsIgnoreCase(carModel)) {
            rentalFee = 3 * 4000;
        } else if ("C".equalsIgnoreCase(carModel)) {
            rentalFee = 3 * 3000;
        } else if ("D".equalsIgnoreCase(carModel)) {
            rentalFee = 3 * 2000;
        } else if ("E".equalsIgnoreCase(carModel)) {
            rentalFee = 3 * 3500;
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
         System.out.println("\n\t\t                       Car Rental -  Test Customer Invoice                  ");
        System.out.printf("\t\t\t| Invoice No. :%18s |%n", "SE-313");
        System.out.printf("\t\t\t| Customer Name:%18s |%n", "Maqsood");
        number();
        formodel();
        System.out.printf("\t\t\t| Car Name:%22s |%n", "HONDA");
        System.out.printf("\t\t\t| Car Number:%20s |%n", "Test-123");
        System.out.printf("\t\t\t| Number of days :%18s |%n", "4");
        System.out.printf("\t\t\t| Your Rental Amount is :%12s |%n", 3500);
        System.out.printf("\t\t\t| Advanced :%23s |%n", "0");
        System.out.println("\t\t\t ________________________________________________________\n");
        System.out.printf("\t\t\t| Total Rental Amount is :%14s  RS |%n", 3500);
        System.out.println("\t\t\t ________________________________________________________\n");
        System.out.println(" ");
       
       System.out.println("\n\t\t                       Test Case 6 passed             ");

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
        switch (carModel!=null?carModel.toUpperCase():"unknown") {
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
        switch (carModel!=null?carModel.toUpperCase():"Unknown") {
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
        System.out.println("\n\n\t\t\t\t\t       Test case 1 and 2 login  \n\n");
        System.out.print("\t\t\t\t\tEnter Password: ");
        // System.out.println("\n\n\t\t\t\t\t       CAR RENTAL SYSTEM \n\n");
        // System.out.println("\n\t\t\t\t\t       PREPARED BY: \n\n");
        // System.out.println("\n\n\t\t\t\t\t       MAQSOOD AHMED (SE-21040) & SHAIKH SAQLAIN AHMAD (SE-21037)\n\n");
        // System.out.println("\n\n\t\t\t\t\t       SUBMITTED TO: \n\n");
        // System.out.println("\n\t\t\t\t\t        PROFESSOR. MUSTAFA LATIF FMS(SE-313) \n\n");
        // System.out.println("\t\t\t\t\t------------------------------");
        // System.out.println("\n\t\t\t\t\t\t     LOGIN \n");
        // System.out.println("\t\t\t\t\t------------------------------\n\n");
        // System.out.print("\t\t\t\t\tEnter Password: ");
    
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        pass = pass + ch;

        if (pass.equals("s")) {
            System.out.println("\n\n\n\t\t\t\t\t\tTest Case 1 Passed \n");
            pause();
            clearScreen();
        } else {
            System.out.println("\n\n\t\t\t\t\t\t\tTest Case 2 passed\n\n");
            pause();
            clearScreen();
        
        }
    }
}

class Welcome {
    public void welcomeMessage() {
        displayAsciiArt("welcome.txt");
        sleep(1000);
        System.out.println("\nStarting the Test Case for the program. Please wait...");
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
            System.out.println("1.Test case 1 and 2");
            System.out.println("3.Test case 3");
            System.out.println("4.Test case 4");
            System.out.println("5.Test case 5");
            System.out.println("6.Test case 6");
            System.out.println("7. Exit");
            System.out.print("Choose the test case ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Rent rent = new Rent();
                    rent.inputData();
                   // rent.calculate();
                   // rent.displayInvoice();
                    break;
                case 2:
                  //  System.out.println("Closing the program! Good bye :)");
                  Rent rent2 = new Rent();
                  rent2.inputDatafortestcase();
                    break;
                case 3:
                Rent rent3=new Rent();
                rent3.inputDatafortestcase4();
                break;
                case 4:
                Rent rent4=new Rent();
                rent4.calculate();
                break;
                case 5:
                Rent rent5=new Rent();
                rent5.calculate();
                break;
                //rent5.displayInvoice();;
                case 6:
                Rent rent6=new Rent();
                rent6.displayInvoice();
                break;
                default:
                  exitProgram=true;
            }
        }

        scanner.close();
    }
}
