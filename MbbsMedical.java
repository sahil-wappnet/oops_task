// class for MBBS Student operations
class MbbsMedical extends MedicalStudent {

    // array-list of MBBS student which contain id,name & email
    static ArrayList<Integer> listofMbbsStudentId = new ArrayList<Integer>();
    static ArrayList<String> listofMbbsStudentName = new ArrayList<String>();
    static ArrayList<String> listofMbbsStudentMobile = new ArrayList<String>();

    public static void fetchData() {
        Scanner fetchStudentId = new Scanner(System.in);
        Scanner fetchStudentName = new Scanner(System.in);
        System.out.println(" ");

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

    // loop for display data one by one from arraylist
    for (int i = 0; i < listofMbbsStudentId.size(); i++) {

    System.out.println("\nStudent Id: " + listofMbbsStudentId.get(i) + "\nStudent
    Name: "
    + listofMbbsStudentName.get(i) + "\nStudent Mobile Number: " +
    listofMbbsStudentMobile.get(i));

    }

    }

}
