package OOP;

public class Employee {
    private String name, level;
    private int salary;

    public Employee(String name, String level, int salary){
        this.name = name;
        this.level = level;
        this.salary = salary;
    }

    void calculatebonus(){
    }

    String getName(){
        return name;
    }
    String getLevel(){
        return level;
    }

    int getSalary(){
        return salary;
    }

}
class Manager extends Employee {
    String departemen;
    double gajiBonus = getSalary() * 1.1;
    public Manager(String name, String level, int salary, String departemen) {
        super(name, level, salary);
        this.departemen = departemen;
    }

    @Override
    void calculatebonus() {
        System.out.println(
                "Nama: " + getName() + ", Level: " + getLevel() + ", Departemen: " + departemen + ", Gaji Awal: " + getSalary() + ", Bonus 10%: " + gajiBonus
        );
    }
}

class Developer extends Employee {
    String programmingLanguage;
    double gajiBonus = getSalary() * 1.05;
    public  Developer(String name, String level, int salary, String programmingLanguage){
        super(name, level, salary);
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    void calculatebonus() {
        System.out.println(
                "Nama: " + getName() + ", Level: " + getLevel() + ", Bahasa Pemrograman: " + programmingLanguage + ", Gaji Awal: " + getSalary()+ ", Bonus 5% : " + gajiBonus)
        ;
    }
}

class EmployeeApp {
    public static void main(String[] args) {
        printInfo(new Manager("Amba", "Senior", 9_000_000, "Keuangan"));
        printInfo(new Developer("Fuad", "Fresh Graduate", 6_000_000, "Assembly"));

    }

    static void printInfo(Employee employee) {
        if (employee instanceof Manager) {
            Manager mngr = (Manager) employee;
            System.out.println("Namanya: " + mngr.getName() + ", Level: " + mngr.getLevel() + ", Departemen: " + mngr.departemen + ", Gaji Awal: " + mngr.getSalary() + ", Gaji Bonus 10%: " + mngr.gajiBonus);
        }
        else if (employee instanceof Developer) {
            Developer dvlpr = (Developer) employee;
            System.out.println("Namanya: " + dvlpr.getName() + ", Level: " + dvlpr.getLevel() + ", Bahasa Pemrograman: " + dvlpr.programmingLanguage + ", Gaji Awal: " + dvlpr.getSalary() + ", Gaji Bonus 5%: " + dvlpr.gajiBonus);
        }
    }

}

