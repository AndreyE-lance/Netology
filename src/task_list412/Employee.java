package task_list412;

public class Employee {
    private String surname;
    private String name;
    private int age;
    private String sex;
    private String background;
    private String position;
    private String department;

    public Employee(String surname, String name, int age, String sex, String background, String position, String department) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.background = background;
        this.position = position;
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%-11s %-7s %-7d %-7s %-11s %-11s %-10s", surname, name, age, sex, background, position, department);
    }

    public String forChangeString() {
        return "1. " + surname +
                "\n2. " + name +
                "\n3. " + age +
                "\n4. " + sex +
                "\n5. " + background +
                "\n6. " + position +
                "\n7. " + department;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
