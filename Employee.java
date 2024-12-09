import java.util.Scanner;

public class Employee {
    int empId;
    String firstName;
    int age;
    String date;
    String department;
    String yob;
    Double finalSalary;

    public Employee(int empId, String firstName, int age, String date, String department, String yob, Double finalSalary) {
        this.empId = empId;
        this.firstName = firstName;
        this.age = age;
        this.date = date;
        this.department = department;
        this.yob = yob;
        this.finalSalary = finalSalary;
    }
    Scanner sc = new Scanner(System.in);

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getDate() {
        return date;
    }

    public String getDepartment() {
        return department;
    }

    public String getYob() {
        return yob;
    }

    public Double getFinalSalary() {
        return finalSalary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
         while (age<=18) {
            System.out.println("age must be greater than 18");
            age= sc.nextInt();
         }
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public void setFinalSalary(Double finalSalary) {
        this.finalSalary = finalSalary;
    }
    public static void main(String[] args) {
        

        Payroll permanentworkers = new PermanentEmployee(12, null"Alain", 0, null, null, null, null)
    }
}
