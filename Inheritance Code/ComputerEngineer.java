class ComputerEngineer extends EngineeringStudent {

    // array-list of student data which contain id,name & email
    static ArrayList<Integer> listofComputerStudentId = new ArrayList<Integer>();
    static ArrayList<String> listofComputerStudentName = new ArrayList<String>();
    static ArrayList<String> listofComputerStudentMobile = new ArrayList<String>();

    // Fetch data from user about computer engineer
    public static void fetchData() {

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
        sentData(id, name, mobileno);
    }

    // send data to array list of computer,Engineer,and all Students
    public static void sentData(int id, String name, String number) {
        listofComputerStudentId.add(id);
        listofComputerStudentName.add(name);
        listofComputerStudentMobile.add(number);
        addToAllData(id, name, number);
        addToEngineerData(id, name, number);
    }

    // display all the data of Computer Engineer which we receive from all the
    // fields
    // function is void so return nothing
    public static void displayData() {
        System.out.println(" ");
        System.out.println("List of Students from Computer branch");

        // loop for display data one by one from arraylist
        for (int i = 0; i < listofComputerStudentId.size(); i++) {
            System.out.println("\nStudent Id: " + listofComputerStudentId.get(i) +
                    "\nStudent Name: "
                    + listofComputerStudentName.get(i) + "\nStudent Mobile Number: "
                    + listofComputerStudentMobile.get(i));

        }

    }

}
