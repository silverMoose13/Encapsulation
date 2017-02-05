package lab4;

public class HiringCompany {
    //the job of this class will be to delegate to the Hr representative to 
    //initiate the new hire orientation process
    private HrRepresentative hrRep; 
    
    public HiringCompany() {
        hrRep = new HrRepresentative();
    }
}
