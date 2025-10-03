package OOPS;

class Department {
    private String departmentCode;
    private String departmentName;
    private String building;
    private int foundedYear;

    public Department(String departmentCode, String departmentName, String building, int foundedYear) {
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.building = building;
        this.foundedYear = foundedYear;
    }

    public void displayDetails() {
        System.out.println("\n--- Department Details ---");
        System.out.println("Code: " + departmentCode);
        System.out.println("Name: " + departmentName);
        System.out.println("Building: " + building);
        System.out.println("Founded: " + foundedYear);
    }
    
    public String getDeptCode() {
        return departmentCode;
    }
}

class CollegeMember {
    protected String id;
    protected String name;

    public CollegeMember(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayCommonDetails(String title) {
        System.out.println("\n--- " + title + " Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class TeachingStaff extends CollegeMember {
    private String qualification;
    private String dateOfJoining;
    private String deptCode;

    public TeachingStaff(String id, String name, String qualification, String dateOfJoining, String deptCode) {
        super(id, name);
        this.qualification = qualification;
        this.dateOfJoining = dateOfJoining;
        this.deptCode = deptCode;
    }

    public void displayDetails() {
        super.displayCommonDetails("Teaching Staff");
        System.out.println("Qualification: " + qualification);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Department Code: " + deptCode);
    }
    
    public String getTeacherCode() {
        return id;
    }
}

class StudentDetails extends CollegeMember {
    private String mobileNumber;
    private String emailId;
    private String deptCode;
    private String teacherCode;

    public StudentDetails(String id, String name, String mobileNumber, String emailId, String deptCode, String teacherCode) {
        super(id, name);
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.deptCode = deptCode;
        this.teacherCode = teacherCode;
    }

    public void displayDetails() {
        super.displayCommonDetails("Student");
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Email ID: " + emailId);
        System.out.println("Department Code: " + deptCode);
        System.out.println("Handling Teacher ID: " + teacherCode);
    }
    
    public String getStudentId() {
        return id;
    }
}

class StudentMarks {
    private String studentId;
    private int semesterNumber;
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;
    private int subject4Marks;

    public StudentMarks(String studentId, int semesterNumber, int sub1, int sub2, int sub3, int sub4) {
        this.studentId = studentId;
        this.semesterNumber = semesterNumber;
        this.subject1Marks = sub1;
        this.subject2Marks = sub2;
        this.subject3Marks = sub3;
        this.subject4Marks = sub4;
    }

    public int calculateTotal() {
        return subject1Marks + subject2Marks + subject3Marks + subject4Marks;
    }

    public double calculateAverage() {
        return (double) calculateTotal() / 4.0;
    }

    public void displayMarksDetails() {
        int total = calculateTotal();
        double average = calculateAverage();
        
        System.out.println("\n--- Marks Report for Student ID: " + studentId + " (Semester " + semesterNumber + ") ---");
        System.out.println("Subject 1 Marks: " + subject1Marks);
        System.out.println("Subject 2 Marks: " + subject2Marks);
        System.out.println("Subject 3 Marks: " + subject3Marks);
        System.out.println("Subject 4 Marks: " + subject4Marks);
        System.out.println("Total Marks: " + total + " / 400");
        System.out.printf("Average Marks: %.2f%%\n", average);
    }
}

public class Ass1 {
    public static void main(String[] args) {
        
        Department cseDept = new Department("CSE", "Computer Science Engineering", "Tech Block A", 2005);
        cseDept.displayDetails();
        
        TeachingStaff profAlice = new TeachingStaff("T101", "Dr. Alice Smith", "Ph.D. in AI", "2020-08-15", cseDept.getDeptCode());
        profAlice.displayDetails();
        
        TeachingStaff profBob = new TeachingStaff("T102", "Mr. Bob Johnson", "M.Tech in Networks", "2022-01-10", cseDept.getDeptCode());
        profBob.displayDetails();
        
        System.out.println("\n\n#############################################");
        System.out.println("        Student Enrollment & Details");
        System.out.println("#############################################");

        StudentDetails student1 = new StudentDetails("S001", "Emma Watson", "9876543210", "emma@college.edu", cseDept.getDeptCode(), profAlice.getTeacherCode());
        StudentDetails student2 = new StudentDetails("S002", "Liam Miller", "9123456789", "liam@college.edu", cseDept.getDeptCode(), profAlice.getTeacherCode());
        StudentDetails student3 = new StudentDetails("S003", "Olivia Green", "9555512345", "olivia@college.edu", cseDept.getDeptCode(), profBob.getTeacherCode());
        StudentDetails student4 = new StudentDetails("S004", "Noah Brown", "9900088888", "noah@college.edu", cseDept.getDeptCode(), profBob.getTeacherCode());
        StudentDetails student5 = new StudentDetails("S005", "Ava Williams", "9444477777", "ava@college.edu", cseDept.getDeptCode(), profAlice.getTeacherCode());
        
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
        student5.displayDetails();

        System.out.println("\n\n#############################################");
        System.out.println("          Student Marks Calculation");
        System.out.println("#############################################");
        
        StudentMarks marks1 = new StudentMarks(student1.getStudentId(), 2, 85, 78, 92, 88);
        marks1.displayMarksDetails();

        StudentMarks marks2 = new StudentMarks(student2.getStudentId(), 2, 65, 70, 75, 68);
        marks2.displayMarksDetails();
        
        StudentMarks marks3 = new StudentMarks(student3.getStudentId(), 2, 95, 98, 90, 93);
        marks3.displayMarksDetails();

        StudentMarks marks4 = new StudentMarks(student4.getStudentId(), 2, 55, 62, 58, 60);
        marks4.displayMarksDetails();

        StudentMarks marks5 = new StudentMarks(student5.getStudentId(), 2, 80, 85, 79, 83);
        marks5.displayMarksDetails();
    }

 
}