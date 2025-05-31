package com.example.testproject.designpatterns.facade

/**
 * The Facade Design Pattern is a structural design pattern that provides a
 * simplified interface to a complex subsystem. It helps reduce the complexity of
 * interactions between client code and a set of classes, by providing a higher-level
 * interface that makes the subsystem easier to use.
 */

//Subsystem
class Storage {
    fun saveData(data: String) {
        println("Data saved successfully: $data")
    }
}

//Subsystem
class Logger {
    fun logEvent(message: String) {
        println("Event logged: $message")
    }
}

//Subsystem
class Notifier {
    fun notifyUser(message: String) {
        println("Notificatiom: $message ")
    }
}