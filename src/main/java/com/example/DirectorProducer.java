package com.example;

class DirectorProducer implements WorkerFactory {

    @Override
    public Worker createWorker(String firstName, String lastName) {
        return new Worker(
                firstName,
                lastName,
                Position.DIRECTOR,
                10000
        );
    }
}