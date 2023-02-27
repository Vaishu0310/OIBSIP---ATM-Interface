import java.util.Scanner;

class ATMinterface {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int balance = 2000000, withdraw, deposit;

        while (true) {
            System.out.println("*****  ATM Interface  *****");
            System.out.println("");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. EXIT\n");

            System.out.print("Choose the operation you want to perform:");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.print("Enter money to be withdraw:");
                    withdraw = in.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        System.out.println("After withdraw avaliable balance : " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("---------------------------------------------");
                    break;

                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.print("Enter money to be deposite:");
                    deposit = in.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("After deposit avaliable balance : " + balance);
                    System.out.println("---------------------------------------------");
                    break;

                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Balance : " + balance);
                    System.out.println("---------------------------------------------");
                    break;

                case 4:
                    System.exit(1);
            }

        }
    }
}