public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private int salary;
    private static int counter = 1;
    private Integer id;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public Integer getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.id = counter++;
        this.surname = surname;
        this.patronymic = patronymic;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                " id: " + id +
                ", Фамилия: '" + surname + '\'' +
                ", Имя: '" + name + '\'' +
                ", Отчество: '" + patronymic + '\'' +
                ", Отделение: " + department +
                ", Зарплата: " + salary;
    }
}
