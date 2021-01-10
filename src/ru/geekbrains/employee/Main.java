package ru.geekbrains.employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = {
                new Employee("Ya1",10,1000),
                new Employee("Ya2",20,2000),
                new Employee("Ya2",30,3000),

        };
        for (int i = 0;i< employee.length;i++){

            //System.out.println(employee[i].printInfo());
            System.out.println(employee[i].toString());
        }

    }
}
