import java.util.ArrayList;
import java.util.Scanner;

class Students {

    static ArrayList<Integer> allStudentId = new ArrayList<Integer>();
    static ArrayList<String> allStudentName = new ArrayList<String>();
    static ArrayList<String> allStudentMobile = new ArrayList<String>();

    public static void addToAllData(int id, String name, String number) {
        allStudentId.add(id);
        allStudentName.add(name);
        allStudentMobile.add(number);
    }

    final public static void displayAllData() {
        System.out.println(" ");
        System.out.println("List of All Students");
        for (int i = 0; i < allStudentId.size(); i++) {
            System.out.println("\nStudent Id: " + allStudentId.get(i) + "\nStudent Name:" + allStudentName.get(i)
                    + "\nStudent Mobile Number: " + allStudentMobile.get(i));

        }
    }

}

class EngineeringStudent extends Students {

    static ArrayList<Integer> engineerStudentId = new ArrayList<Integer>();
    static ArrayList<String> engineerStudentName = new ArrayList<String>();
    static ArrayList<String> engineerStudentMobile = new ArrayList<String>();

    public static void addToEngineerData(int id, String name, String number) {
        engineerStudentId.add(id);
        engineerStudentName.add(name);
        engineerStudentMobile.add(number);
    }

    public static void displayEngineerData() {
        System.out.println(" ");
        System.out.println("List of Engineering Students");
        for (int i = 0; i < engineerStudentId.size(); i++) {
            System.out.println("\nStudent Id: " + engineerStudentId.get(i) + "\nStudent Name:"
                    + engineerStudentName.get(i) + "\nStudent Mobile Number: " + engineerStudentMobile.get(i));

        }
    }

}

class MedicalStudent extends Students {

    static ArrayList<Integer> medicalStudentId = new ArrayList<Integer>();
    static ArrayList<String> medicalStudentName = new ArrayList<String>();
    static ArrayList<String> medicalStudentMobile = new ArrayList<String>();

    public static void addToMedicalData(int id, String name, String number) {
        medicalStudentId.add(id);
        medicalStudentName.add(name);
        medicalStudentMobile.add(number);
    }

    public static void displayMedicalData() {
        System.out.println(" ");
        System.out.println("List of Medical Students");
        for (int i = 0; i < medicalStudentId.size(); i++) {
            System.out.println("\nStudent Id: " + medicalStudentId.get(i) + "\nStudent Name:"
                    + medicalStudentName.get(i) + "\nStudent Mobile Number: " + medicalStudentMobile.get(i));

        }
    }

}

class ComputerEngineer extends EngineeringStudent {
    static ArrayList<Integer> listofComputerStudentId = new ArrayList<Integer>();
    static ArrayList<String> listofComputerStudentName = new ArrayList<String>();
    static ArrayList<String> listofComputerStudentMobile = new ArrayList<String>();

    public static void fetchData() {
        Scanner fetchStudentId = new Scanner(System.in);
        Scanner fetchStudentName = new Scanner(System.in);

        System.out.println("  ");

        System.out.print("Enter the Id of Student : ");
        int id = fetchStudentId.nextInt();
        System.out.print("Enter the Name of Student : ");
        String name = fetchStudentName.nextLine();
        System.out.print("Enter the Mobile Number of Student : ");
        String mobileno = fetchStudentName.nextLine();
        sentData(id, name, mobileno);
    }

    public static void sentData(int id, String name, String number) {
        listofComputerStudentId.add(id);
        listofComputerStudentName.add(name);
        listofComputerStudentMobile.add(number);
        addToAllData(id, name, number);
        addToEngineerData(id, name, number);
    }

    public static void displayData() {
        System.out.println(" ");
        System.out.println("List of Students from Pharma branch");

        for (int i = 0; i < listofComputerStudentId.size(); i++) {
            System.out.println("\nStudent Id: " + listofComputerStudentId.get(i) + "\nStudent Name: "
                    + listofComputerStudentName.get(i) + "\nStudent Mobile Number: "
                    + listofComputerStudentMobile.get(i));

        }

    }

}

class MechanicalEngineer extends EngineeringStudent {

    static ArrayList<Integer> listofMechStudentId = new ArrayList<Integer>();
    static ArrayList<String> listofMechStudentName = new ArrayList<String>();
    static ArrayList<String> listofMechStudentMobile = new ArrayList<String>();

    public static void fetchData() {
        Scanner fetchStudentId = new Scanner(System.in);
        Scanner fetchStudentName = new Scanner(System.in);

        System.out.println("  ");

        System.out.print("Enter the Id of Student : ");
        int id = fetchStudentId.nextInt();
        System.out.print("Enter the Name of Student : ");
        String name = fetchStudentName.nextLine();
        System.out.print("Enter the Mobile Number of Student : ");
        String mobileno = fetchStudentName.nextLine();
        sentData(id, name, mobileno);
    }

    public static void sentData(int id, String name, String number) {
        listofMechStudentId.add(id);
        listofMechStudentName.add(name);
        listofMechStudentMobile.add(number);
        addToAllData(id, name, number);
        addToEngineerData(id, name, number);
    }

    public static void displayData() {
        System.out.println(" ");
        System.out.println("List of Students from Pharma branch");

        for (int i = 0; i < listofMechStudentId.size(); i++) {
            System.out.println("\nStudent Id: " + listofMechStudentId.get(i) + "\nStudent Name: "
                    + listofMechStudentName.get(i) + "\nStudent Mobile Number: "
                    + listofMechStudentMobile.get(i));

        }

    }

}

class PharmaMedical extends MedicalStudent {
    static ArrayList<Integer> listofPharmaStudentId = new ArrayList<Integer>();
    static ArrayList<String> listofPharmaStudentName = new ArrayList<String>();
    static ArrayList<String> listofPharmaStudentMobile = new ArrayList<String>();

    public static void fetchData() {
        Scanner fetchStudentId = new Scanner(System.in);
        Scanner fetchStudentName = new Scanner(System.in);

        System.out.println("  ");

        System.out.print("Enter the Id of Student : ");
        int id = fetchStudentId.nextInt();
        System.out.print("Enter the Name of Student : ");
        String name = fetchStudentName.nextLine();
        System.out.print("Enter the Mobile Number of Student : ");
        String mobileno = fetchStudentName.nextLine();
        sentData(id, name, mobileno);
    }

    public static void sentData(int id, String name, String number) {
        listofPharmaStudentId.add(id);
        listofPharmaStudentName.add(name);
        listofPharmaStudentMobile.add(number);
        addToAllData(id, name, number);
        addToMedicalData(id, name, number);
    }

    public static void displayData() {
        System.out.println(" ");
        System.out.println("List of Students from Pharma branch");

        for (int i = 0; i < listofPharmaStudentId.size(); i++) {
            System.out.println("\nStudent Id: " + listofPharmaStudentId.get(i) + "\nStudent Name: "
                    + listofPharmaStudentName.get(i) + "\nStudent Mobile Number: " + listofPharmaStudentMobile.get(i));

        }

    }

}

class MbbsMedical extends MedicalStudent {

    static ArrayList<Integer> listofMbbsStudentId = new ArrayList<Integer>();
    static ArrayList<String> listofMbbsStudentName = new ArrayList<String>();
    static ArrayList<String> listofMbbsStudentMobile = new ArrayList<String>();

    public static void fetchData() {
        Scanner fetchStudentId = new Scanner(System.in);
        Scanner fetchStudentName = new Scanner(System.in);
        System.out.println("  ");

        System.out.print("Enter the Id of Student : ");
        int id = fetchStudentId.nextInt();
        System.out.print("Enter the Name of Student : ");
        String name = fetchStudentName.nextLine();
        System.out.print("Enter the Mobile Number of Student : ");
        String mobileno = fetchStudentName.nextLine();
        sentData(id, name, mobileno);
    }

    public static void sentData(int id, String name, String number) {
        listofMbbsStudentId.add(id);
        listofMbbsStudentName.add(name);
        listofMbbsStudentMobile.add(number);
        addToAllData(id, name, number);
        addToMedicalData(id, name, number);

    }

    public static void displayData() {
        System.out.println(" ");
        System.out.println("List of Students from MBBS branch");
        for (int i = 0; i < listofMbbsStudentId.size(); i++) {

            System.out.println("\nStudent Id: " + listofMbbsStudentId.get(i) + "\nStudent Name: "
                    + listofMbbsStudentName.get(i) + "\nStudent Mobile Number: " + listofMbbsStudentMobile.get(i));

        }

    }

}

public class TaskInheritance {
    public static void main(String[] args) {

        ChooseAddOrDisplay();

    }

    public static void ChooseAddOrDisplay() {
        System.out.println(" ");
        System.out.println("Info:   Press 0 for Add data" + "\nInfo:   Press 1 for Display data"
                + "\nInfo:   Press 2 for Terminate program");
        System.out.println(" ");
        System.out.println("Want Add Data or Display Data?");
        Scanner myScanner = new Scanner(System.in);
        byte temp = myScanner.nextByte();

        if (temp == 0) {
            forAddChooseField();
        } else if (temp == 1) {
            forDisplayChooseField();
        } else if (temp == 2) {
            System.exit(0);
        } else {
            System.out.println("Please Enter correct Option");
            forDisplayChooseField();

        }
    }

    public static void forAddChooseField() {
        System.out.println(" ");
        System.out.println("Info:   Press 1 for Add data in Computer Engineering "
                + "\nInfo:   Press 2 for Add data in Mechanical Engineering"
                + "\nInfo:   Press 3 for Add data in Pharma "
                + "\nInfo:   Press 4 for Add data in MBBS"
                + "\nInfo:   Press 5 for Terminate program");
        Scanner myScanner = new Scanner(System.in);
        byte temp = myScanner.nextByte();

        if (temp == 1) {
            ComputerEngineer.fetchData();
            ChooseAddOrDisplay();

        } else if (temp == 2) {
            MechanicalEngineer.fetchData();
            ChooseAddOrDisplay();

        } else if (temp == 3) {
            PharmaMedical.fetchData();
            ChooseAddOrDisplay();

        } else if (temp == 4) {
            MbbsMedical.fetchData();
            ChooseAddOrDisplay();
        } else if (temp == 5) {
            System.exit(0);
        } else {
            System.out.println("Please Enter correct value...");
            forAddChooseField();
        }

    }

    public static void forDisplayChooseField() {
        System.out.println("Info:   Press 1 for Display data in All Student Data " +
                "\nInfo:   Press 2 for Display data in Engineering Student Data"
                + "\nInfo:   Press 3 for Display data in Medical Student Data" +
                "\nInfo:   Press 4 for Display data in Computer Engineering Student Data"
                + "\nInfo:   Press 5 for Display data in Mechanical Engineering Student Data" +
                "\nInfo:   Press 6 for Add data in Pharma Student"
                + "\nInfo:   Press 7 for Add data in MBBS Student Data"
                + "\nInfo:   Press 8 for Terminate program");
        Scanner myScanner = new Scanner(System.in);
        byte temp = myScanner.nextByte();
        if (temp == 1) {
            Students.displayAllData();
            ChooseAddOrDisplay();
        } else if (temp == 2) {
            ComputerEngineer.displayEngineerData();
            ChooseAddOrDisplay();
        } else if (temp == 3) {
            MedicalStudent.displayMedicalData();
            ChooseAddOrDisplay();
        } else if (temp == 4) {
            ComputerEngineer.displayData();
            ChooseAddOrDisplay();
        } else if (temp == 5) {
            MechanicalEngineer.displayData();
            ChooseAddOrDisplay();
        } else if (temp == 6) {
            PharmaMedical.displayData();
            ChooseAddOrDisplay();
        } else if (temp == 7) {
            MbbsMedical.displayData();
            ChooseAddOrDisplay();
        } else if (temp == 8) {
            System.exit(0);
        } else {
            System.out.println("Please Enter correct value...");
            forDisplayChooseField();
        }
    }
}