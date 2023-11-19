package JavaDevelopment.school.Inheritance;

public class Person {
    String name, lastname, gender;
    int age;

    Person(String name, String lastname, String gender, int age){
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;

        System.out.println("Person Created!");
    }
}
