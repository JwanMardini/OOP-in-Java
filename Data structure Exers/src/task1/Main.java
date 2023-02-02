package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jwan1", 12345);
        Person p2 = new Person("Jwan2", 1234567);
        Person p3 = new Person("Jwan3", 1234589);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p2);
        list.add(p1);
        list.add(p3);
        for(Person p: list){
            System.out.println(p.getName());
        }

        Person p4 = new Person("Jwan4", 321654);
        list.add(5, p4);

        System.out.println();
        for(Person p: list){
            System.out.println(p.getName());
        }


    }
}