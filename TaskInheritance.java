import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

// Main Class
public class TaskInheritance {

    // execution begins from here
    public static void main(String[] args) {

        // myScanner to fetch value from user
        Scanner myScanner = new Scanner(System.in);

        ChooseAddOrDisplay(); // choose add or display
    }

    // method defination where you choose add or display data
    public static void ChooseAddOrDisplay() {

        System.out.println("\nInfo: Press 0 for Add data");
        System.out.println("\nInfo: Press 1 for Display data");
        System.out.println("\nInfo: Press 2 for Terminate program");
        System.out.println("\nWant Add Data or Display Data?");

        byte temp = myScanner.nextByte();

        switch (temp) {
            case 0:
                forAddChooseField();
                break;
            case 1:
                forDisplayChooseField();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("\nPlease Enter correct Option");
                ChooseAddOrDisplay();
                break;
        }
    }

    public static void forAddChooseField() {
        System.out.println("\nInfo: Press 1 for Add data in Computer Engineering");
        System.out.println("\nInfo: Press 2 for Add data in Mechanical Engineering");
        System.out.println("\nInfo: Press 4 for Add data in MBBS");
        System.out.println("\nInfo: Press 3 for Add data in Pharma");
        System.out.println("\nInfo: Press 5 for Terminate program");

        byte temp = myScanner.nextByte();

        switch (temp) {
            case 1:
                ComputerEngineer.fetchData();
                ChooseAddOrDisplay();
                break;
            case 2:
                MechanicalEngineer.fetchData();
                ChooseAddOrDisplay();
                break;
            case 3:
                PharmaMedical.fetchData();
                ChooseAddOrDisplay();
                break;
            case 4:
                MbbsMedical.fetchData();
                ChooseAddOrDisplay();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter correct value...");
                forAddChooseField();
                break;
        }
    }

    public static void forDisplayChooseField() {
        System.out.println("\nInfo: Press 1 for Display data in All Student Data ");
        System.out.println("\nInfo: Press 2 for Display data in Engineering Student Data");
        System.out.println("\nInfo: Press 3 for Display data in Medical Student Data");
        System.out.println("\nInfo: Press 4 for Display data in Computer Engineering Student Data");
        System.out.println("\nInfo: Press 5 for Display data in Mechanical Engineering Student Data");
        System.out.println("\nInfo: Press 6 for Add data in Pharma Student");
        System.out.println("\nInfo: Press 7 for Add data in MBBS Student Data");
        System.out.println("\nInfo: Press 8 for Terminate program");
        System.out.println("\nInfo: Press 8 for Terminate program");

        byte temp = myScanner.nextByte();

        switch (temp) {
            case 1:
                Students.displayAllData();
                ChooseAddOrDisplay();
                break;
            case 2:
                ComputerEngineer.displayEngineerData();
                ChooseAddOrDisplay();
                break;
            case 3:
                MedicalStudent.displayMedicalData();
                ChooseAddOrDisplay();
                break;
            case 4:
                ComputerEngineer.displayData();
                ChooseAddOrDisplay();
                break;
            case 5:
                MechanicalEngineer.displayData();
                ChooseAddOrDisplay();
                break;
            case 6:
                PharmaMedical.displayData();
                ChooseAddOrDisplay();
                break;
            case 7:
                MbbsMedical.displayData();
                ChooseAddOrDisplay();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter correct value...");
                forDisplayChooseField();
                break;
        }
    }
}