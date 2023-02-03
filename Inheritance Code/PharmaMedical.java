// class for Pharma Student operations
class PharmaMedical extends MedicalStudent {

    // array-list of Pharma student which contain id,name & email
    static ArrayList<Integer> listofPharmaStudentId = new ArrayList<Integer>();
    static ArrayList<String> listofPharmaStudentName = new ArrayList<String>();
    static ArrayList<String> listofPharmaStudentMobile = new ArrayList<String>();

    // Fetch data from user about Pharma
    public static void fetchData() {
        Scanner fetchStudentId = new Scanner(System.in);
        // Scanner fetchStudentName = new Scanner(System.in);

        System.out.println(" ");

        System.out.print("Enter the Id of Student : ");
        int id = fetchStudentId.nextInt();
        System.out.print("Enter the Name of Student : ");
        String name = fetchStudentId.next();
        System.out.print("Enter the Mobile Number of Student : ");
        String mobileno = fetchStudentId.next();
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

        // loop for display data one by one from arraylist
        for (int i = 0; i < listofPharmaStudentId.size(); i++) {
            System.out.println("\nStudent Id: " + listofPharmaStudentId.get(i) +
                    "\nStudent Name: "
                    + listofPharmaStudentName.get(i) + "\nStudent Mobile Number: " +
                    listofPharmaStudentMobile.get(i));

        }

    }

}
