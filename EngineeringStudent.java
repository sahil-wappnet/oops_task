// class for all Engineering Student operation
class EngineeringStudent extends Students {

    // array-list of Engineering student data which contain id,name & email
    static ArrayList<Integer> engineerStudentId = new ArrayList<Integer>();
    static ArrayList<String> engineerStudentName = new ArrayList<String>();
    static ArrayList<String> engineerStudentMobile = new ArrayList<String>();

    // add data from different classes
    (eg.ComputerEngineer,MechanicalEngineering)
    // sendData() method
    // function is void so return nothing

    public static void addToEngineerData(int id, String name, String number) {
        engineerStudentId.add(id);
        engineerStudentName.add(name);
        engineerStudentMobile.add(number);
    }

    // display all the data which we receive from all the fields
    // function is void so return nothing
    public static void displayEngineerData() {
    System.out.println(" ");
    System.out.println("List of Engineering Students");

    // loop for display data one by one from arraylist
    for (int i = 0; i < engineerStudentId.size(); i++) {
    System.out.println("\nStudent Id: " + engineerStudentId.get(i) + "\nStudent
    Name:"
    + engineerStudentName.get(i) + "\nStudent Mobile Number: " +
    engineerStudentMobile.get(i));

    }
    }

}
