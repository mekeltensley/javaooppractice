public class Employee {
    String name;
    int age;
    int salary;
    String location;
    int years ;

    Employee (String name, int age, int salary, String location, int years) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
        this.years = years;

    }

    void raiseSalary() {
        if (years >= 2 && location == "Chicago") {
            salary += 10000;
            System.out.println("Congratulations, you are eligible for a promotion");
        } else {
            System.out.println("Sorry, you are not eligible for a salary increase yet.");
        }
    }
}


