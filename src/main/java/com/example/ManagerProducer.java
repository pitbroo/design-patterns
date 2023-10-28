package com.example;

 class ManagerProducer implements WorkerFactory {
    @Override
    public Worker createWorker(String firstName, String lastName) {
        return new Worker(
                firstName,
                lastName,
                Position.MANAGER,
                7000
        );
    }
}
