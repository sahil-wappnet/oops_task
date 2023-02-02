import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Details {
    int sid;
    String sname, snumber;

    public Details(int sid2, String sname2, String snumber2) {
        this.sid = sid2;
        this.sname = sname2;
        this.snumber = snumber2;
    }

}

class Student {
    int std_id;
    String std_name, std_number;
    static List<Details> StuDetails = new ArrayList<Details>();

    public Student(int id, String name, String number) {
        this.std_id = id;
        this.std_name = name;
        this.std_number = number;
        Details b1 = new Details(id, name, number);
        StuDetails.add(b1);
    }

    public static void displayStuData() {
        System.out.println("All Student Data\n");

        for (Details b : StuDetails) {
            System.out.println("Student id: " + b.sid + "\nStudent name: " + "" + b.sname + "\nStudent number: "
                    + b.snumber + "\n");

        }
    }

}

class MedStu extends Student {
    int Med_std_id;
    String Med_std_name, Med_std_number;
    static List<Details> MedDetails = new ArrayList<Details>();

    public MedStu(int id, String name, String number) {
        super(id, name, number);
        this.Med_std_id = id;
        this.Med_std_name = name;
        this.Med_std_number = number;
        Details b1 = new Details(id, name, number);
        MedDetails.add(b1);
    }

    public static void displayMedData() {
        System.out.println("Medical Student Data\n");

        for (Details b : MedDetails) {
            System.out.println("Student id: " + b.sid + "\nStudent name: " + "" + b.sname + "\nStudent number: "
                    + b.snumber + "\n");

        }
    }

}

class PharmaMedStu extends MedStu {

    int pharma_med_std_id;
    String pharma_med_std_name, pharma_med_std_number;
    static List<Details> pharmaMedDetails = new ArrayList<Details>();

    public PharmaMedStu(int id, String name, String number) {
        super(id, name, number);
        this.pharma_med_std_id = id;
        this.pharma_med_std_name = name;
        this.pharma_med_std_number = number;
        Details b1 = new Details(id, name, number);
        pharmaMedDetails.add(b1);
    }

    public static void displayPharmaData() {
        System.out.println("Pharma Student Data\n");
        for (Details b : pharmaMedDetails) {
            System.out.println("Student id: " + b.sid + "\nStudent name: " + "" + b.sname + "\nStudent number: "
                    + b.snumber + "\n");
        }
    }
}

class MbbsMedStu extends MedStu {

    int mbbs_med_std_id;
    String mbbs_med_std_name, mbbs_med_std_number;
    static List<Details> MbbsMedDetails = new ArrayList<Details>();

    public MbbsMedStu(int id, String name, String number) {
        super(id, name, number);
        this.mbbs_med_std_id = id;
        this.mbbs_med_std_name = name;
        this.mbbs_med_std_number = number;
        Details b1 = new Details(id, name, number);
        MbbsMedDetails.add(b1);
    }

    public static void displayMbbsData() {
        System.out.println("Mbbs Student Data\n");
        for (Details b : MbbsMedDetails) {
            System.out.println("Student id: " + b.sid + "\nStudent name: " + "" + b.sname + "\nStudent number: "
                    + b.snumber + "\n");
        }
    }
}

class EngStu extends Student {
    int eng_std_id;
    String eng_std_name, eng_std_number;
    static List<Details> engDetails = new ArrayList<Details>();

    public EngStu(int id, String name, String number) {
        super(id, name, number);
        this.eng_std_id = id;
        this.eng_std_name = name;
        this.eng_std_number = number;
        Details b1 = new Details(id, name, number);
        engDetails.add(b1);
    }

    public static void displayEngData() {
        System.out.println("Engineering Student Data\n");

        for (Details b : engDetails) {
            System.out.println("Student id: " + b.sid + "\nStudent name: " + "" + b.sname + "\nStudent number: "
                    + b.snumber + "\n");

        }
    }

}

class MechEngStu extends EngStu {

    int mech_eng_std_id;
    String mech_eng_std_name, mech_eng_std_number;
    static List<Details> mechEngDetails = new ArrayList<Details>();

    public MechEngStu(int id, String name, String number) {
        super(id, name, number);
        this.mech_eng_std_id = id;
        this.mech_eng_std_name = name;
        this.mech_eng_std_number = number;
        Details b1 = new Details(id, name, number);
        mechEngDetails.add(b1);
    }

    public static void displayMechData() {
        System.out.println("Mechanical Engineering Student Data\n");
        for (Details b : mechEngDetails) {
            System.out.println("Student id: " + b.sid + "\nStudent name: " + "" + b.sname + "\nStudent number: "
                    + b.snumber + "\n");

        }
    }
}

class ComEngStu extends EngStu {

    int com_eng_std_id;
    String com_eng_std_name, com_eng_std_number;
    static List<Details> comEngDetails = new ArrayList<Details>();

    public ComEngStu(int id, String name, String number) {
        super(id, name, number);
        this.com_eng_std_id = id;
        this.com_eng_std_name = name;
        this.com_eng_std_number = number;
        Details b1 = new Details(id, name, number);
        comEngDetails.add(b1);
    }

    public static void displayComData() {
        System.out.println("Computer Engineering Student Data\n");
        for (Details b : comEngDetails) {
            System.out.println("Student id: " + b.sid + "\nStudent name: " + "" + b.sname + "\nStudent number: "
                    + b.snumber + "\n");
        }
    }
}

class AdvanceTask {
    public static void main(String[] args) {
        ChooseAddOrDisplay();
    }

    public static void ChooseAddOrDisplay() {
        System.out.println(" ");
        System.out.println("Info: Press 0 for Add data" + "\nInfo: Press 1 for Display data"
                + "\nInfo: Press 2 for Terminate program");
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
            ChooseAddOrDisplay();
        }
    }

    public static void forAddChooseField() {
        System.out.println(" ");
        System.out.println("Info: Press 1 for Add data in Computer Engineering "
                + "\nInfo: Press 2 for Add data in Mechanical Engineering" + "\nInfo: Press 3 for Add data in Pharma "
                + "\nInfo: Press 4 for Add data in MBBS" + "\nInfo: Press 5 for Terminate program");
        Scanner myScanner = new Scanner(System.in);
        byte temp = myScanner.nextByte();

        if (temp == 1) {
            ComEngStu c1 = new ComEngStu(1, "null", "null");
            ChooseAddOrDisplay();

        } else if (temp == 2) {
            MechEngStu c2 = new MechEngStu(2, "null", "null");
            ChooseAddOrDisplay();

        } else if (temp == 3) {
            PharmaMedStu c3 = new PharmaMedStu(3, "null", "null");
            ChooseAddOrDisplay();

        } else if (temp == 4) {
            MbbsMedStu c4 = new MbbsMedStu(4, "null", "null");
            ChooseAddOrDisplay();
        } else if (temp == 5) {
            System.exit(0);
        } else {
            System.out.println("Please Enter correct value...");
            forAddChooseField();
        }

    }

    public static void forDisplayChooseField() {
        System.out.println("Info: Press 1 for Display data in All Student Data " +
                "\nInfo: Press 2 for Display data in Engineering Student Data"
                + "\nInfo: Press 3 for Display data in Medical Student Data"
                + "\nInfo: Press 4 for Display data in Computer Engineering Student Data"
                + "\nInfo: Press 5 for Display data in Mechanical Engineering Student Data"
                + "\nInfo: Press 6 for Add data in Pharma Student" + "\nInfo: Press 7 for Add data in MBBS Student Data"
                + "\nInfo: Press 8 for Terminate program");

        // myScanner to fetch value from user
        Scanner myScanner = new Scanner(System.in);
        byte temp = myScanner.nextByte();

        // Else if ladder for choose to display purpose
        if (temp == 1) {
            Student.displayStuData();
            ChooseAddOrDisplay();
        } else if (temp == 2) {
            EngStu.displayEngData();
            ChooseAddOrDisplay();
        } else if (temp == 3) {
            MedStu.displayMedData();
            ChooseAddOrDisplay();
        } else if (temp == 4) {
            ComEngStu.displayComData();
            ChooseAddOrDisplay();
        } else if (temp == 5) {
            MechEngStu.displayMechData();
            ChooseAddOrDisplay();
        } else if (temp == 6) {
            PharmaMedStu.displayPharmaData();
            ChooseAddOrDisplay();
        } else if (temp == 7) {
            MbbsMedStu.displayMbbsData();
            ChooseAddOrDisplay();
        } else if (temp == 8) {
            System.exit(0);
        } else {
            System.out.println("Please Enter correct value...");
            forDisplayChooseField();
        }
    }
}