package JavaOOP_2.company;

import JavaOOP_2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Hân", 23, "nữ", "204 Lý Thường Kiệt","0395264796");
        System.out.println(person.getName()+ " " + person.getAge() + " " + person.getGender());
    }
}
