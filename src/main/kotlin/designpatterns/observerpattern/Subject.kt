package com.example.testproject.designpatterns.observerpattern

/**
 * The Observer Pattern is a behavioral design pattern where an
 * object (called the Subject) maintains a list of observers and
 * notifies them automatically when its state changes.
 */
class Subject {
    private val observers = mutableSetOf<Observer>()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun updateObserver(data: String) {
        observers.forEach { it.update(data) }
    }
}