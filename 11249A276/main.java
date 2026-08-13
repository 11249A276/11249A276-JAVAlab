class Employee {
    int id;
    String name;
    double basic;

    Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }
}

class PermanentEmployee extends Employee {
    double hra, da;

    PermanentEmployee(int id, String name, double basic, double hra, double da) {
        super(id, name, basic);
        this.hra = hra;
        this.da = da;
    }

    void display() {
        double gross = basic + hra + da;

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}

public class main {
    public static void main(String[] args) {
        PermanentEmployee e = new PermanentEmployee(101, "Arun", 20000, 5000, 3000);
        e.display();
    }
}
