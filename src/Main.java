// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Nirnay");
        controller.setEmployeeDepartment("IT");
        System.out.println("\n Employee Details after updating: ");

        controller.updateView();
    }
//this part doesnt exist

    private static Employee retriveEmployeeFromDatabase(){
        Employee Employee = new Employee();
        Employee.setName("Anu");
        Employee.setId("11");
        Employee.setDepartment("Salesforce");
        return Employee;
    }
}
