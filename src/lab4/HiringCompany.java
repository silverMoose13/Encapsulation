package lab4;

public class HiringCompany {
    
    HrRepresentative hrRep = new HrRepresentative();
    
    //the hiring company delegates the work to the hrRep to perform the hiring
    //this entails the orientation and the outputting of the report
    public void completeEmployeeOnboarding(String firstName, String lastName, String ssn) {
        hrRep.completeEmployeeHiringProcess(firstName, lastName, ssn);
        hrRep.outputEmployeeReport(ssn);
    }
    
    
    
    
}
