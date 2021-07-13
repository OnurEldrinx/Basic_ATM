import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        String defaultUsername = "admin",defaultPassword = "1234",usernameInput,passwordInput;

        final String operationMenu = "****************\n1.Invest Money\n2.Withdraw Money\n3.Show Balance\n4.Exit\n****************";

        int defaultLoginTicketNumber = 3;
        int balance=0;
        int operationChoice;



        while (defaultLoginTicketNumber > 0){

            System.out.println("***** LOGIN *****");
            System.out.print("Username: ");
            usernameInput = keyboard.nextLine();
            System.out.print("Password: ");
            passwordInput = keyboard.nextLine();
            System.out.println();

            if (usernameInput.equals(defaultUsername) && passwordInput.equals(defaultPassword)){


                while (true) {

                    System.out.println();
                    System.out.println(operationMenu);

                    System.out.print("Your Choice:");
                    operationChoice = keyboard.nextInt();

                    if (operationChoice == 4) {

                        System.out.println("\n!!! Have a nice day !!!\n");
                        keyboard.nextLine();
                        break;

                    }

                    switch (operationChoice) {

                        case 1:
                            System.out.print("The amount of money you want to invest:");
                            int investment = keyboard.nextInt();
                            balance = balance + investment;
                            System.out.println("You invested " + investment + " $ into your account.");
                            System.out.println("New Balance: " + balance);
                            break;

                        case 2:
                            System.out.print("The amount of money you want to withdraw:");
                            int withdrawal = keyboard.nextInt();

                            if (withdrawal > balance) {

                                System.out.println("There is not enough money!");

                            } else {
                                balance = balance - withdrawal;
                                System.out.println("You withdrew " + withdrawal + " $ from your account.");
                                System.out.println("New Balance: " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Balance: " + balance);
                            break;

                        default:
                            System.out.println("Wrong Input");

                    }
                }

            }else{

                defaultLoginTicketNumber--;


                if (defaultLoginTicketNumber == 0){

                    System.out.println("Your account is blocked.Please appeal to your bank.");
                    break;

                }else{

                    System.out.println("Check your username or password!");
                    System.out.println("You have "+defaultLoginTicketNumber+" tickets to access your account!\n");

                }

            }


        }

    }
}
