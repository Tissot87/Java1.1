package Lesson5;

public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[5];
        person[0] = new Person("Ivan", "Ivanov", "Manager", "i.ivanov@", 101, 30000, 21);
        person[1] = new Person("Petr", "Petrov", "HR", "hr@", 102, 25000, 32);
        person[2] = new Person("Olga", "Smirnova", "Accountant", "acc@", 103, 31000, 44);
        person[3] = new Person("Victor", "Orlov", "Driver", "driver@", 104, 28000, 49);
        person[4] = new Person("Anna", "Gavrilova", "PR", "pr@", 105, 25500, 40);

        for (int i = 0; i < person.length ; i++) {
            if (person[i].age > 40)
                person[i].info();

        }


    }
}
