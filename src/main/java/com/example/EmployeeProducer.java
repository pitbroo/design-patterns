package com.example;

class EmployeeProducer implements WorkerFactory{

    @Override
    public Worker createWorker(String firstName, String lastName) {
        return new Worker(
                firstName,
                lastName,
                Position.EMPLOYEE,
                4000
        );
    }
}
