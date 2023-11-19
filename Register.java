package JavaDevelopment.school.Inheritance;
import java.util.Scanner;
public class Register extends Person {

    Register(String name, String lastname, String gender, int age) {
        super(name, lastname, gender, age);
    }

    String getName(){
        return name;
    }

    
}
