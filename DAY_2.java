//import java.util.Scanner;
//
//public class DAY_2 {
//    public static void main(String[]args){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your AGE to get a discount on MOVIE TICKETS : ");
//        int Age = scan.nextInt();
//        if (Age < 12) {
//            System.out.println("You get a 50% DISCOUNT on your ticket");
//        } else if (Age > 60) {
//            System.out.println("You get a 30% DISCOUNT on your ticket");
//        } else {
//            System.out.println("You Don't get a discount you have to pay the FULL TICKET");
//        }
//        scan.close();
//    }
//}
//import java.util.Scanner;
//
//public class DAY_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your ROOM TEMP : ");
//        int Temp = scan.nextInt();
//        if (Temp < 18) {
//            System.out.println("The temperature is TOO COLD");
//        } else if (Temp > 30) {
//            System.out.println("The temperature is TOO HOT");
//        } else {
//            System.out.println("The temperature is COMFORTABLE");
//        }
//        scan.close();
//    }
//}
//import java.util.Scanner;
//
//public class DAY_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your MARKS : ");
//        int Marks = scan.nextInt();
//        if (Marks>=35&&Marks<=100) {
//            System.out.println("You have successfully PASSED");
//        } else if (Marks<35&&Marks>0) {
//            System.out.println("You have FAILED try again");
//        } else if(Marks<=0||Marks>100){
//            System.out.println("INVALID CHOICE!");
//        }
//        scan.close();
//    }
//}
//import java.util.Scanner;
//
//public class DAY_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("----- MENU -----");
//        System.out.println("1. Pizza");
//        System.out.println("2. Burger");
//        System.out.println("3. Sandwich");
//        System.out.println("4. Pasta");
//        System.out.println("5. Salad");
//        System.out.print("Enter your menu number: ");
//        int choice = scan.nextInt();
//        switch (choice) {
//            case 1:
//                System.out.println("You selected Pizza ");
//                break;
//            case 2:
//                System.out.println("You selected Burger ");
//                break;
//            case 3:
//                System.out.println("You selected Sandwich ");
//                break;
//            case 4:
//                System.out.println("You selected Pasta ");
//                break;
//            case 5:
//                System.out.println("You selected Salad ");
//                break;
//            default:
//                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
//        }
//        scan.close();
//    }
//}
import java.util.Scanner;

public class DAY_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accountBalance = 5000;
        System.out.println("Welcome to the ATM!");
        System.out.println("Your current balance: ₹" + accountBalance);
        System.out.print("Enter withdrawal amount: ₹");
        int amount = scan.nextInt();
        if (amount % 100 != 0) {
            System.out.println("Error: Withdrawal amount must be in multiples of ₹100.");
        }
        else if (amount > accountBalance) {
            System.out.println("Error: Insufficient balance.");
        }
        else if (amount > 0) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful! You withdrew ₹" + amount);
            System.out.println("Remaining balance: ₹" + accountBalance);
        }
        else {
            System.out.println("Error: Invalid withdrawal amount.");
        }

        scan.close();
    }
}

