package lab4;

import java.util.Date;

public class DepartmentSupervisor {

    //the job of the department supervisor is to partake in the onboarding of
    //the employee for the department related activities. This work is
    //delegated from the HR rep.
    private final String CRLF = "\n"; // carriage return line feed
    private final String REQUIRED_MSG = " is mandatory ";
    
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    private DateUtility dateUtil;
    private EmployeeReportService reportService;
    Employee newEmp = new Employee();

    //perform this second. Dept sup does this task. If some of the staff is out of the office
    //the dept supervisor can perform this independently.
    public void meetDepartmentStaff() {
        metDeptStaff = true;
        reportService.addData(newEmp.getFirstName() + " " + newEmp.getLastName() + " met with Dept. Staff on "
                + dateUtil.getFormattedDate(orientationDate) + CRLF);
    }

    //performed 3rd. Dept sup job. set to public because it can be ran independently
    public void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        reportService.addData(newEmp.getFirstName() + " " + newEmp.getLastName() + " reviewed Dept policies on "
                + dateUtil.getFormattedDate(orientationDate) + CRLF);
    }

    //perform 4th. set to public because it can be ran independently. Department sup job.
    public void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        reportService.addData(newEmp.getFirstName() + " " + newEmp.getLastName() + " moved into cubicle "
                + cubeId + " on " + dateUtil.getFormattedDate(orientationDate) + CRLF);
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        if (cubeId == null || cubeId.isEmpty()) {
            throw new IllegalArgumentException("cube id" + REQUIRED_MSG);
        }
        this.cubeId = cubeId;
    }

}
