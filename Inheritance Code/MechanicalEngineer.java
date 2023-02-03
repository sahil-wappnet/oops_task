class MechanicalEngineer extends EngineeringStudent {

    // array-list of Mechanical student which contain id,name & email
    static ArrayList<Integer> listofMechStudentId = new ArrayList<Integer>();
    static ArrayList<String> listofMechStudentName = new ArrayList<String>();
    static ArrayList<String> listofMechStudentMobile = new ArrayList<String>();

    // Fetch data from user about Mechanical engineer
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
        listofMechStudentId.add(id);
        listofMechStudentName.add(name);
        listofMechStudentMobile.add(number);
        addToAllData(id, name, number);
        addToEngineerData(id, name, number);
    }

    // display all the data of Mech Students which we receive from all the fields
    // function is void so return nothing
    public static void displayData() {
    System.out.println(" ");
    System.out.println("List of Students from Mechanical branch");

    // loop for display data one by one from arraylist
    for (int i = 0; i < listofMechStudentId.size(); i++) {
    System.out.println("\nStudent Id: " + listofMechStudentId.get(i) + "\nStudent
    Name: "
    + listofMechStudentName.get(i) + "\nStudent Mobile Number: "
    + listofMechStudentMobile.get(i));

    }

    }

}
