public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Sazonov Daniil");
        employeeBook.addEmployee("Sergey Semenov");
        employeeBook.addEmployee("Ivan Ivanov");


        employeeBook.showAll();

        System.out.println();

        System.out.println(employeeBook.findEmployeeId(0));

        System.out.println();

        System.out.println(employeeBook.findEmployeeName("Sergey Semenov"));

        System.out.println();

        employeeBook.removeEmployee(0);

        System.out.println();

        System.out.println(employeeBook.findEmployeeId(0));

        System.out.println();

        employeeBook.showAll();


    }
}