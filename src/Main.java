import java.util.Arrays;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee employee1 = new Employee("Путин", "Владимир",
                "Владимирович", 1, 100000000);
        Employee employee2 = new Employee("Медведев", "Дмитрий",
                "Анатольевич", 1, 50000000);
        Employee employee3 = new Employee("Байден", "Джо",
                "Дональдович", 2, 5000000);
        Employee employee4 = new Employee("Обама", "Барак",
                "Джорджевич", 2, 15000000);
        Employee employee5 = new Employee("Макрон", "Эммануель",
                "Игоревич", 3, 3000000);
        Employee employee6 = new Employee("Жан", "Поль",
                "Бельмондович", 3, 200000);
        Employee employee7 = new Employee("Ален", "Де",
                "Лонович", 4, 7000000);
        Employee employee8 = new Employee("Малкович", "Джон",
                "Малкович", 4, 700000);
        Employee employee9 = new Employee("Ли", "Брюс",
                "Уиллисович", 5, 80000);
        Employee employee10 = new Employee("Чан", "Джеки",
                "Арнольдович", 5, 12000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;


        Employee[] empArr = Arrays.copyOf(employees, 10);
        Arrays.stream(empArr).forEach(System.out::println);
        System.out.println(empArr.length);


    }

    // Методы:
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calcAllSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee empMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee empMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calcAverSalary() {
        return calcAllSalary() / (float) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getPatronymic() + " " + employee.getSurname());
        }
    }
}
