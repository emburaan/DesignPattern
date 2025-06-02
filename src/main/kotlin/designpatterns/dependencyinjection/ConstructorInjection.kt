package designpatterns.dependencyinjection

/**
 * Dependency Injection (DI) is a design pattern used to achieve Inversion
 * of Control (IoC) between classes and their dependencies. Instead of creating dependencies inside a class,
 * they are "injected" from the outside, making the code more modular, testable, and scalable.
 *
 *** Most Commonly used
 */
class Engine {
    fun start() = println("Engine started")
}

class Car(private val engine: Engine) {
    fun drive() {
        engine.start()
        println("Car is moving")
    }
}

// Usage
fun main() {
    val engine = Engine()
    val car = Car(engine) // Injecting dependency
    car.drive()
}