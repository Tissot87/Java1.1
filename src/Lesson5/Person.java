package Lesson5;

public class Person {
    public String name;
    public String surname;
    public String position;
    public String email;
    public int phoneNumber;
    public int salary;
    public int age;

    public Person(String name, String surname, String position, String email, int phoneNumber, int salary, int age){
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Person(String name, String surname, String position, String email, int phoneNumber, int salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Person(String name, String surname, String position, String email, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, String surname, String position, String email) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
    }

    public Person(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void info(){
        System.out.println("Имя " + name + "; Фамилия " + surname + "; Должность " + position + "; Электронная почта " + email + "; Номер телефона " + phoneNumber + "; Зарплата " + salary + "; Возраст " + age );
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
