/*
We have a Department interface, which acts as the component. Both leaf and composite classes implement this interface.
FinanceDepartment and HRDepartment are leaf classes representing individual departments.
HeadDepartment is the composite class, which can contain other departments (both leaf and composite). It implements the Department interface and manages a list of child departments.
In the CompositePatternExample class, we create instances of leaf departments (FinanceDepartment and HRDepartment) and a composite department (HeadDepartment). We add leaf departments to the composite department and then print the hierarchy using the printDepartmentName() method.
This example demonstrates how the Composite pattern allows clients to treat individual objects and compositions of objects uniformly.
 */

public class Main {
    public static void main(String[] args) {

        Department financeDepartment = new FinanceDepartment();
        Department hrDepartment = new HRDepartment();

        HeadDepartment headDepartment = new HeadDepartment("Corporate");
        headDepartment.addDepartment(financeDepartment);
        headDepartment.addDepartment(hrDepartment);

        // Print all departments
        headDepartment.printDepartmentName();

        System.out.println("Composite Pattern Example!");
    }
}