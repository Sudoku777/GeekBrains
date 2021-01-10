package ru.geekbrains.employee;

public class Employee {
    private String name;
    private int age;
    private float salary;

    public Employee(String name,int age,float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.printf("Employee{name=%s, age=%s, salary=%s}%n",name,age,salary);
    }
    public String info(){
        return String.format("Employee{name=%s, age=%s, salary=%s}",name,age,salary);
    }

}
