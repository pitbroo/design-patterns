package com.example;

public class Main {
    public static void main(String[] args) {
        EmployeeProducer employeeProducer = new EmployeeProducer();
        Worker employee = employeeProducer.createWorker("Jan", "Kowalski");
        System.out.println("Employee: " + employee);

        ManagerProducer managerProducer = new ManagerProducer();
        Worker manager = managerProducer.createWorker("Paweł", "Nowak");
        System.out.println("Manager: " + manager);

        DirectorProducer directorProducer = new DirectorProducer();
        Worker director = directorProducer.createWorker("Kamil", "Chmielewski");
        System.out.println("Director: "+director);
    }
}
