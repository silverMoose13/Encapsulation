package lab4;

public class HrRepresentative {

    //object to access the employee class. A new default constructor was
    //added since the 3 string parameters were not needed for giveNewEmployeeOrientation
    Employee newEmp = new Employee();

    //here the other constructor is called with the 3 parameters
    //the hr rep delegates the work to the employee to supply the information
    public void completeEmployeeHiringProcess(String firstName, String lastName, String ssn) {
        Employee newEmpInfo = new Employee(firstName, lastName, ssn);
        newEmpInfo.setFirstName(firstName);
        newEmpInfo.setLastName(lastName);
        newEmpInfo.setSsn(ssn);
        giveNewEmployeeOrientation();
    }

    //the HR rep coordinates the orientation for the new employee
    //the employee still keeps the methods for the activities
    //since the employee will be performing the actual activities
    public void giveNewEmployeeOrientation() {
        newEmp.doFirstTimeOrientation("A101");
    }

}
