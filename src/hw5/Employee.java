package hw5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Max Kryvenko", "Manager", "maxkryvenko99@gmail.com", "+380675478334", 24);
        System.out.println(employee.fullName + " works as " + employee.position);
    }
}
