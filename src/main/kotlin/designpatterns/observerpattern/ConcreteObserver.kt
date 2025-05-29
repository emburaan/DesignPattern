package com.example.testproject.designpatterns.observerpattern

class ConcreteObserver(private val name: String) : Observer {
    override fun update(data: String) {
        println("$name received update: $data")
    }
}

fun main() {
    val subject = Subject()

    val observer1 = ConcreteObserver("Observer 1")
    val observer2 = ConcreteObserver("Observer 2")

    subject.addObserver(observer1)
    subject.addObserver(observer2)

    subject.updateObserver("New Event!") // Notifies all observers
}