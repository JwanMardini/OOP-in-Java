package se.hkr.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String [] projects = new String[2];
        projects[0] = "PPG Signal";
        projects[1] = "Thorax Signal";
        Employee manager = new Manager(1, "John", "R&D",
                100000, projects);

        String[] tools = new String[3];
        tools[0] = "Selenium";
        tools[1] = "TestingWhiz";
        tools[2] = "Ranorex";
        Employee tester = new Tester(2, "Anna", "R&D",
                80000, tools);

        Employee developer = new Developer(3, "Rickard","R&D", 10,
                "Quantum Computer Algorithms");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(tester);
        employees.add(developer);

        Main main = new Main();
        main.printEmployees(employees);

    }

    public void printEmployees(ArrayList<Employee> employees){
        System.out.println(employees.get(0).getName() + " is Manager!");
        employees.get(0).work();
        System.out.println( employees.get(1).getName() + " is Tester!");
        employees.get(1).work();
        System.out.println(employees.get(2).getName() + " is Developer!");
        employees.get(2).work();

    }


}