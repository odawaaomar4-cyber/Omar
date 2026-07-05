//omar ali abdi
//c6240225

import java.util.Scanner;

 class EdahabSystem {

    static Scanner input = new Scanner(System.in);
    static String pin = "1234";

    public static void main(String[] args) {
        homeMenu();
    }
    public static void homeMenu() {

        while (true) {
            System.out.println("====== E-DHAB SYSTEM ======");
            System.out.println("1. Shilling");
            System.out.println("2. Dollar");
            System.out.println("0. Exit");
            System.out.print("Dooro lacagta: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    mainMenu("Shilling");
                    break;
                case 2:
                    mainMenu("Dollar");
                    break;
                case 0:
                    System.out.println("System waa la xiray...");
                    return;
                default:
                    System.out.println("Doorasho khaldan!");
            }
        }
    }

    // ================= MAIN MENU =================
    public static void mainMenu(String currency) {

        while (true) {
            System.out.println("\n=== " + currency + " MENU ===");
            System.out.println("1. Xisaabtaada");
            System.out.println("2. U wareeji");
            System.out.println("3. Kaarka hadalka");
            System.out.println("4. Ku iibso");
            System.out.println("5. Lacag bixid");
            System.out.println("6. Dahabshiil account");
            System.out.println("0. Back");

            System.out.print("Dooro: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    accountMenu();
                    break;
                case 2:
                    transferMenu();
                    break;

                case 0:
                    return;
                default:
                    System.out.println("doorasho qaldan!");
            }
        }
    }

    //================= XISAABTAADA =================

    static double balance = 5000;

    public static void accountMenu() {

        while (true) {

            System.out.println("\n===== XISAABTAADA =====");
            System.out.println("1. Itus Haraagaaga");
            System.out.println("2. Warbixin Kooban");
            System.out.println("3. Badal PIN");
            System.out.println("4. Badal Luuqadda");
            System.out.println("5. Liiska Magacyada");
            System.out.println("6. Daryeelka Macaamiisha");
            System.out.println("0. Back");

            System.out.print("Dooro: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    showBalance();
                    break;

                case 2:
                    miniStatement();
                    break;

                case 3:
                    changePin();
                    break;

                case 4:
                    changeLanguage();
                    break;

                case 5:
                    contactMenu();
                    break;

                case 6:
                    customerCare();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Doorasho Khaldan!");
            }

        }

    }

    public static void showBalance() {

        System.out.print("Geli PIN-kaaga: ");
        String p = input.next();

        if (p.equals(pin)) {

            System.out.println("Haraagaagu waa: $" + balance);
            System.out.println("Date: 08/07/2026");

        } else {

            System.out.println("PIN waa khaldan yahay.");

        }

    }

    public static void miniStatement() {

        System.out.print("Geli PIN-kaaga: ");
        String p = input.next();

        if (p.equals(pin)) {

            System.out.println("Warbixintii ugu dambeysay");
            System.out.println("--------------------------");
            System.out.println("Deposit : +1000");
            System.out.println("Transfer : -200");
            System.out.println("Balance : $" + balance);
            System.out.println("Date : 08/07/2026");

        } else {

            System.out.println("PIN waa khaldan yahay.");

        }

    }

    public static void changePin() {

        System.out.print("Geli PIN-kaagii hore: ");
        String oldPin = input.next();

        if (oldPin.equals(pin)) {

            System.out.print("Geli PIN cusub: ");
            String newPin = input.next();

            if (newPin.length() == 4) {

                pin = newPin;

                System.out.println("Waad ku guuleysatay.");
                System.out.println("PIN-ka waa la beddelay.");

            } else {

                System.out.println("PIN-ku waa inuu noqdaa 4 lambar.");

            }

        } else {

            System.out.println("PIN waa khaldan yahay.");

        }

    }

    public static void changeLanguage() {

        System.out.println("1. English");
        System.out.println("2. Soomaali");

        int lang = input.nextInt();

        if (lang == 1) {

            System.out.println("Your default language has been changed to English.");

        } else if (lang == 2) {

            System.out.println("Luqadda waxaa loo beddelay Soomaali.");

        } else {

            System.out.println("Doorasho khaldan.");

        }

    }

    public static void contactMenu() {

        while (true) {

            System.out.println("\n===== LIISKA MAGACYADA =====");
            System.out.println("1. Ku dar");
            System.out.println("2. Itus");
            System.out.println("3. Tirtir");
            System.out.println("0. Back");

            int c = input.nextInt();

            switch (c) {

                case 1:

                    System.out.print("Geli lambarka: ");
                    String num = input.next();

                    System.out.println("Macaamiil waa la keydiyay.");

                    break;

                case 2:

                    System.out.print("Geli PIN: ");

                    String p = input.next();

                    if (p.equals(pin)) {

                        System.out.println("Liiska waa madhan.");

                    } else {

                        System.out.println("PIN waa khaldan yahay.");

                    }

                    break;

                case 3:

                    System.out.println("Macaamiil waa la tirtiray.");

                    break;

                case 0:

                    return;

                default:

                    System.out.println("Doorasho khaldan.");

            }

        }

    }

    public static void customerCare() {

        System.out.println("Wac 152");
        System.out.println("Mahadsanid.");

    }

    //==================== U WAREEJI ====================

    public static void transferMenu() {

        while (true) {

            System.out.println("\n===== U WAREEJI =====");
            System.out.println("1. U Wareeji Mobile");
            System.out.println("2. Lacag Dirid Dibadda");
            System.out.println("0. Back");

            System.out.print("Dooro: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    mobileTransfer();
                    break;

                case 2:
                    internationalTransfer();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Doorasho Khaldan!");

            }

        }

    }

    public static void mobileTransfer() {

        while (true) {

            System.out.println("\n1. Lambarka Macaamiilka");
            System.out.println("2. Liiska Magacyada");
            System.out.println("0. Back");

            int choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Geli lambarka: ");
                    String phone = input.next();

                    System.out.print("Geli lacagta: ");
                    double amount = input.nextDouble();

                    System.out.print("Geli PIN-kaaga: ");
                    String p = input.next();

                    if (p.equals(pin)) {

                        if (amount <= balance) {

                            balance -= amount;

                            System.out.println("Waxaad $" + amount +
                                    " ugu wareejisay " + phone);

                            System.out.println("Haraagaagu waa $" + balance);
                            System.out.println("Date: 08/07/2026");

                        } else {

                            System.out.println("Haraagaagu kuma filna.");

                        }

                    } else {

                        System.out.println("PIN waa khaldan yahay.");

                    }

                    break;

                case 2:

                    System.out.println("No Contact.");

                    break;

                case 0:

                    return;

                default:

                    System.out.println("Doorasho Khaldan.");

            }

        }

    }

    public static void internationalTransfer() {

        System.out.println("\n===== LACAG DIRID DIBADDA =====");

        System.out.println("No Contact");

    }

}
