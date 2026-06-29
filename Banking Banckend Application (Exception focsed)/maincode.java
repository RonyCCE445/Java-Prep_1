import java.util.*;

public class maincode {

    public static void main(String[] args) {

        HashMap<Integer, BankAccount> BankAccounts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n####################################");
            System.out.println("Welcome to the Banking Application");
            System.out.println("####################################");
            System.out.println("############ Menu ##################");
            System.out.println("1. New User");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Display Details");
            System.out.println("0. Exit");
            System.out.println("####################################");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter your name: ");
                    String name = sc.next();

                    System.out.print("Enter Opening Balance: ");
                    int balance = sc.nextInt();

                    try {
                        BankAccount acc1 = new BankAccount(name, balance);
                        BankAccounts.put(acc1.getAccountNumber(), acc1);

                        System.out.println("\nAccount Successfully Created!");
                        acc1.display();

                    } catch (IllegalArgumentException | InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:

                    System.out.print("Enter Account Number: ");
                    int acc_no = sc.nextInt();

                    BankAccount account = BankAccounts.get(acc_no);

                    if (account == null) {
                        System.out.println("Account " + acc_no + " not found.");
                        break;
                    }

                    System.out.print("Enter Deposit Amount: ");

                    try {
                        double amount = sc.nextDouble();

                        account.deposit(amount);

                        System.out.println("Deposit Successful!");
                        account.display();

                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:

                    System.out.print("Enter Account Number: ");
                    acc_no = sc.nextInt();

                    account = BankAccounts.get(acc_no);

                    if (account == null) {
                        System.out.println("Account " + acc_no + " not found.");
                        break;
                    }

                    System.out.print("Enter Withdrawal Amount: ");

                    try {
                        double amount = sc.nextDouble();

                        account.withdraw(amount);

                        System.out.println("Withdrawal Successful!");
                        account.display();

                    } catch (InvalidAmountException | InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 4:

                    System.out.print("Enter Sender Account Number: ");
                    int sender_acc = sc.nextInt();

                    BankAccount sender = BankAccounts.get(sender_acc);

                    if (sender == null) {
                        System.out.println("Account " + sender_acc + " not found.");
                        break;
                    }

                    System.out.print("Enter Receiver Account Number: ");
                    int receiver_acc = sc.nextInt();

                    BankAccount receiver = BankAccounts.get(receiver_acc);

                    if (receiver == null) {
                        System.out.println("Receiver Account " + receiver_acc + " not found.");
                        break;
                    }

                    System.out.print("Enter Transfer Amount: ");

                    try {
                        double amount = sc.nextDouble();

                        sender.transfer(receiver, amount);

                        System.out.println("Transfer Successful!");

                        System.out.println("\nSender Details:");
                        sender.display();

                        System.out.println("\nReceiver Details:");
                        receiver.display();

                    } catch (InvalidAmountException | InsufficientBalanceException | IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 5:

                    System.out.print("Enter Account Number: ");
                    acc_no = sc.nextInt();

                    account = BankAccounts.get(acc_no);

                    if (account == null) {
                        System.out.println("Account " + acc_no + " not found.");
                    } else {
                        account.display();
                    }

                    break;

                case 0:

                    running = false;
                    System.out.println("Thank you for using the Banking Application!");
                    break;

                default:

                    System.out.println("Invalid Choice! Please try again.");
            }
        }

        sc.close();
    }
}