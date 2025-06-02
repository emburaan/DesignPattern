package designpatterns.dependencyinjection

// Dependency
class Logger {
    fun log(message: String) {
        println("LOG: $message")
    }
}

// Dependent class using property injection
class Application {
    lateinit var logger: Logger  // Dependency to be injected

    fun run() {
        logger.log("Application is starting...")
        println("Application is running.")
    }
}

// Usage
fun main() {
    val app = Application()
    app.logger = Logger()  // Injecting dependency via property
    app.run()
}
