class MedicalStudent extends Students {

    // array-list of Medical Student which contain id,name & email
    static ArrayList<Integer> medicalStudentId = new ArrayList<Integer>();
    static ArrayList<String> medicalStudentName = new ArrayList<String>();
    static ArrayList<String> medicalStudentMobile = new ArrayList<String>();

    // add data from different classes
    (eg.ComputerEngineer,MechanicalEngineering)

    // sendData() method
    // function is void so return nothing
    public static void addToMedicalData(int id, String name, String number) {
        medicalStudentId.add(id);
        medicalStudentName.add(name);
        medicalStudentMobile.add(number);
    }

    // display all the data of Medical Student which we receive from all the
    fields

    // function is void so return nothing
    public static void displayMedicalData() {
    System.out.println(" ");
    System.out.println("List of Medical Students");

    // loop for display data one by one from arraylist
    for (int i = 0; i < medicalStudentId.size(); i++) {
    System.out.println("\nStudent Id: " + medicalStudentId.get(i) + "\nStudent
    Name:"
    + medicalStudentName.get(i) + "\nStudent Mobile Number: " +
    medicalStudentMobile.get(i));

    }
    }

}
