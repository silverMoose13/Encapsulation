package lab4;

import java.util.Date;

public class HrRepresentative {

    private final String REQUIRED_MSG = " is mandatory ";
    private final String CRLF = "\n"; // carriage return line feed

    //migrated the members from the employee class since HR sets up and 
    //orchestrates these activities. Consider making a department supervisor.
    private boolean metWithHr;
    private Date orientationDate;
    //
    private DateUtility dateUtil;
    private EmployeeReportService reportService;

    //called the default constructor from the Employee class.
    //We only needed to access the getters since the job of the HR rep
    //is to just acquire the information from the employee
    Employee newEmp = new Employee();
    DepartmentSupervisor sup = new DepartmentSupervisor();

    public HrRepresentative() {
        dateUtil = new DateUtility();
        reportService = new EmployeeReportService();
    }

    //hiring representative is responsible for setting up the orientation
    //but the HR rep isn't in all of the activities ike meeting the department
    //reviewing dept policies and moving into a cubicle. HR only ensures that these
    //activities actually occur and delegate the work to the employee's new department
    public void doFirstTimeOrientation(String cubeId) {
        orientationDate = new Date();
        meetWithHrForBenefitAndSalryInfo();
        sup.meetDepartmentStaff();
        sup.reviewDeptPolicies();
        sup.moveIntoCubicle(cubeId);
    }

    //perform this first. The HR rep ensures that the employee meets the HR department.
    //This is an HR task
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        reportService.addData(newEmp.getFirstName() + " " + newEmp.getLastName() + " met with Hr on "
                + dateUtil.getFormattedDate(orientationDate) + CRLF);
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    // boolean parameters need no validation
    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(Date orientationDate) {
        if (orientationDate == null) {
            throw new IllegalArgumentException("orientationDate" + REQUIRED_MSG);
        }
        this.orientationDate = orientationDate;
    }
}
