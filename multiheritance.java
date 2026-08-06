
package multyinheritance;

interface Payable {
    void calculateSalary();
}

interface Workable {
    void work();
}

class Employee implements Payable, Workable {

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void calculateSalary() {
        double totalSalary = baseSalary + 2000;
        System.out.println("Total Salary = " + totalSalary);
    }

    public void work() {
        System.out.println(name + " is working on project task.");
    }
}

public class childclass {

    public static void main(String[] args) {

        Employee emp = new Employee("Kunal", 50000);
        emp.calculateSalary();
        emp.work();

        Payable p = emp;
        Workable w = emp;

        p.calculateSalary();
        w.work();
    }
}





