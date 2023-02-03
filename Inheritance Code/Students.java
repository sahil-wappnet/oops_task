//class for All Student operations
class Students {

    static int std_id;
    static String std_name, std_number;

    // array-list of student data which contain id,name & email
    static ArrayList<Integer> allStudentId = new ArrayList<Integer>();
    static ArrayList<String> allStudentName = new ArrayList<String>();
    static ArrayList<String> allStudentMobile = new ArrayList<String>();

    public static void MyMethod() {
        // create scanner class for fetch id,name,and mobile no
        Scanner fetchStudentId = new Scanner(System.in);
        Scanner fetchStudentName = new Scanner(System.in);

        System.out.println(" ");

        System.out.print("Enter the Id of Student : ");
        int id = fetchStudentId.nextInt();
        System.out.print("Enter the Name of Student : ");
        String name = fetchStudentName.nextLine();
        System.out.print("Enter the Mobile Number of Student : ");
        String mobileno = fetchStudentName.nextLine();
    }

    public Students(int id, String name, String number) {
        this.std_id = id;
        this.std_name = name;
        this.std_number = number;

    }

    // add data from different classes
    // (eg.ComputerEngineer,MechanicalEngineering,PharmaMEdical,MbbsMedical)
    // sendData() method
    // function is void so return nothing
    final static void addToAllData(int id, String name, String number) {
        allStudentId.add(id);
        allStudentName.add(name);
        allStudentMobile.add(number);
    }

    // display all the data which we receive from all the fields
    // function is void so return nothing
    final public static void displayAllData() {

        System.out.println(" ");
        System.out.println("List of All Students");

        // loop for display data one by one from arraylist
        for (int i = 0; i < allStudentId.size(); i++) {
            System.out.println("\nStudent Id: " + allStudentId.get(i));
            System.out.println("\nStudent Name:" + allStudentName.get(i));
            System.out.println("\nStudent Mobile Number: " + allStudentMobile.get(i));
        }
    }
}