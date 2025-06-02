package designpatterns.dependencyinjection

// Dependency
class PaymentProcessor {
    fun process(amount: Double) {
        println("Processing payment of \$$amount")
    }
}

// Dependent class using method injection
class PaymentService {
    fun makePayment(amount: Double, processor: PaymentProcessor) {
        processor.process(amount)
        println("Payment of \$$amount completed.")
    }
}

// Usage
fun main() {
    val paymentProcessor = PaymentProcessor()
    val paymentService = PaymentService()

    paymentService.makePayment(100.0, paymentProcessor) // Injecting dependency via method
}
