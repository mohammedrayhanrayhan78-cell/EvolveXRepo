//import java.util.Scanner;
//public class DAY_5{
//    public static void main(String[]args){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the ACCOUNT NUMBER: ");
//        int accountNumber=scan.nextInt();
//        int sum = 0;
//        int temp = accountNumber;
//        while(temp > 0){
//            int digit = temp % 10;
//            sum+=digit;
//            temp/= 10;
//        }
//        System.out.println("The sum of numbers are: " + sum);
//    }
//}
//import java.util.Scanner;
//public class DAY_5{
//    public static void main(String[]args){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your MOBILE NUMBER: ");
//        long Mobilenumber=scan.nextLong();
//        long reversed= 0;
//        long temp = Mobilenumber;
//        while(temp > 0){
//            long digit = temp % 10;
//            reversed=reversed*10+digit;
//            temp/= 10;
//        }
//        System.out.println("The REVERSE OF YOUR NUMBER IS: " + reversed);
//    }
//}
//import java.util.Scanner;
//public class DAY_5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // Step 1: Input
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//        boolean isPrime = true;
//        if (number <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= number / 2; i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println(number + " is a PRIME number.");
//        } else {
//            System.out.println(number + " is NOT a prime number.");
//        }
//    }
//}