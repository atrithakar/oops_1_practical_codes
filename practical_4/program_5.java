// Write a Program to maintain employee’s information. Program should illustrate Inheritance concept. (Use your imagination to create class or subclass used for employee).

class employee {
    protected String name, empId, deptName;
    protected int salary, performanceScore;

    employee(String empId, String name, int salary, String deptName) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.deptName = deptName;
        this.performanceScore = 0;
    }

    void incrementSalary() {
        salary += 0.1 * salary;
    }

    void changePerformanceScore(int score) {
        performanceScore += score;
    }

    void givePromotion() {
        if (this.performanceScore > 1500) {
            System.out.printf("Promoted Successfully.\n");
            this.performanceScore -= 1500;
            salary += 0.15 * salary;
        } else {
            System.out.printf("Try harder.\n");
        }
    }

    void printEmployee() {
        System.out.printf("{ID: %s, Name: %s, Dept name: %s, Salary: %d, Performance score: %d}\n", this.empId,
                this.name, this.deptName, this.salary, this.performanceScore);
    }
}

class programmer extends employee {
    protected String language, techStack;

    programmer(String empId, String name, int salary, String language, String techStack) {
        super(empId, name, salary, "IT");
        this.techStack = techStack;
        this.language = language;
    }

    void incrementSalary() {
        salary += 0.2 * salary;
    }

    void printProgrammer() {
        printEmployee();
        System.out.printf("{Main language: %s, Tech stack: %s}\n", this.language, this.techStack);

    }

    void changeLanguage(String language) {
        this.language = language;
    }

    void changeTechStack(String techStack) {
        this.techStack = techStack;
    }

}

class manager extends employee {
    manager(String empId, String name, int salary) {
        super(empId, name, salary, "Management");
    }

    void incrementSalary() {
        salary += 0.3 * salary;
    }

    void printManager() {
        printEmployee();
    }

    employee hire(String empId, String name, int salary, String dept) {
        employee e = new employee(empId, name, salary, dept);
        System.out.printf("Employee hired successfully!\n");
        return e;
    }
}

public class program_5 {
    public static void main(String[] args) {
        employee e1 = new employee("Emp001", "Carl Johnson", 200000, "Lawyer");

        e1.printEmployee();
        e1.changePerformanceScore(400);
        e1.printEmployee();
        e1.givePromotion();
        e1.changePerformanceScore(1500);
        e1.printEmployee();
        e1.givePromotion();
        e1.printEmployee();
        e1.incrementSalary();
        e1.printEmployee();
        System.out.println();
        programmer p1 = new programmer("Pro001", "Cesar", 400000, "C++", "MERN");
        p1.printProgrammer();
        p1.changePerformanceScore(400);
        p1.printProgrammer();
        p1.givePromotion();
        p1.changePerformanceScore(1500);
        p1.printProgrammer();
        p1.givePromotion();
        p1.printProgrammer();
        p1.incrementSalary();
        p1.printProgrammer();
        p1.changeLanguage("Rust");
        p1.printProgrammer();
        p1.changeTechStack("MEAN");
        p1.printProgrammer();

        System.out.println();
        manager m1 = new manager("Man001", "Tommy Vercetti", 999999999);
        m1.printManager();
        m1.changePerformanceScore(400);
        m1.givePromotion();
        m1.printManager();
        m1.changePerformanceScore(1500);
        m1.givePromotion();
        m1.printManager();
        m1.incrementSalary();
        m1.printManager();
        employee e2 = m1.hire("Emp002", "Trevor", 54000, "Service");
        e2.printEmployee();

    }
}
