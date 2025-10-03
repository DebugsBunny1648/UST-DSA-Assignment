package practiceYt.DSA_Module_2;

public class Member {
    String name;
    int age;
    String phone_no;
    String address;
    double salary;
    Member(String name,int age,String phone_no,String address,double salary){
        this.name=name;
        this.age=age;
        this.phone_no=phone_no;
        this.address=address;
        this.salary=salary;
    }
    void printSalary(){
        System.out.println("Salary is: "+this.salary);
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Prashant", 20, "82669745", "RANCHI", 19563.036, "Computer Science");
        System.out.println("Employee Details: ");
        employee.printDetails();
        Manager manager=new Manager("Harish", 45, "489469+616", "Nawada", 7896523.2, "Devops");
        System.out.println("Manager Details: ");
        manager.printDetails();

    }
}
class Employee extends Member{
    String specialization;

    public Employee(String name,int age,String phone_no,String address,double salary,String specialization){
        super(name, age, phone_no, address, salary);
        this.specialization=specialization;
    }
   
    void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Phone no: "+this.phone_no);
        System.out.println("Address: "+this.address);
        System.out.println("Specilization: "+this.specialization);
        printSalary();
    }
}
class Manager extends Member{
    String department;
    Manager(String name,int age,String phone_no,String address,double salary,String specialization){
        super(name, age, phone_no, address, salary);
        this.department=department;
}
    void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Phone no: "+this.phone_no);
        System.out.println("Address: "+this.address);
        System.out.println("Specilization: "+this.department);
        printSalary();
}
}
   
    
