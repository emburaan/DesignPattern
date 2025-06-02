package designpatterns.startegypattern

/**
 * The Strategy Pattern is a behavioral design pattern that allows
 * you to define a family of algorithms, encapsulate each one, and m
 * ake them interchangeable at runtime. It promotes the Open/Closed Principle
 * by letting you change the algorithm’s behavior without modifying the context class.
 */
interface PaymentStrategy {
    fun pay(amount: Double)
}

class PayPalStrategy(private val email: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid \$$amount using PayPal (email: $email)")
    }
}

class CreditCardStrategy(private val cardNumber: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid \$$amount using Credit Card (card: $cardNumber)")
    }
}
