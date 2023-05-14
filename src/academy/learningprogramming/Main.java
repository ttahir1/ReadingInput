package academy.learningprogramming;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    public static void howOld() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // Handle next line character (enter key).

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;

            if(age>=0 && age<=130) {
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }

    public static void sumUserInput() {
        int sum = 0;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter number #" + count + ".");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                sum += scanner.nextInt();
                count++;
            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        } while(count<11);
        System.out.println("The sum of your inputs is " + sum);
        scanner.close();
    }
    public static void minMax() {
        int minValue = 0;
        int maxValue = 0;
        boolean firstInput = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                if(firstInput){
                    firstInput = false;
                    minValue = number;
                    maxValue = number;
                }
                if(number>maxValue) {
                    maxValue = number;
                }
                if(number<minValue) {
                    minValue = number;

                }
            }
            else {
                break;
            }
            scanner.nextLine();
        } while(true);
        System.out.println("Max = " + maxValue + " Min = " + minValue);

        scanner.close();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                sum += scanner.nextInt();
                counter++;
            }
            else {
                break;
            }
        } while(true);
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/counter));
        scanner.close();
    }

}
