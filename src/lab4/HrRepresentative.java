package lab4;

import java.util.ArrayList;

public class HrRepresentative {

    //ArrayList is more appropriate here since we can initialize an indefinite
    //amount of employees rather than having a specific amount of containers set
    private ArrayList<Employee> empList;

    public HrRepresentative() {
        empList = new ArrayList();
    }

    //getter and setter for the arraylist
    public void setEmployeeInfo(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public ArrayList<Employee> getEmployeeInfo() {
        return empList;
    }

    public void completeEmployeeHiringProcess(String firstName, String lastName, String ssn) {
        Employee newEmpInfo = new Employee(firstName, lastName, ssn);
        newEmpInfo.setFirstName(firstName);
        newEmpInfo.setLastName(lastName);
        newEmpInfo.setSsn(ssn);
        empList.add(newEmpInfo);
        giveNewEmployeeOrientation(newEmpInfo);
    }

    //the HR rep coordinates the orientation for the new employee
    //the employee still keeps the methods for the activities
    //since the employee will be performing the actual activities
    public void giveNewEmployeeOrientation(Employee newEmp) {
        newEmp.doFirstTimeOrientation("A101");
    }

    public void outputEmployeeReport(String ssn) {
        //this is set to null so that the program won't error out
        Employee emp = null;

        //use a for loop to find the ssn in the report and match it with the
        //new employee's
        for (Employee newEmployee : empList) {
            if (newEmployee.getSsn().equals(ssn)) {
                emp = newEmployee;
                break;
            } else {
                return;
            }
        }
        if (emp.isMetWithHr()
                && emp.isMetDeptStaff()
                && emp.isReviewedDeptPolicies()
                && emp.isMovedIn()) {

            emp.getReportService().outputReport();
        }
    }
}
