package designpatterns.startegypattern

class ShoppingCart {
    private var paymentStrategy: PaymentStrategy? = null

    fun setPaymentStrategy(strategy: PaymentStrategy) {
        paymentStrategy = strategy
    }

    fun checkout(amount: Double) {
        paymentStrategy?.pay(amount) ?: println("Payment strategy not set.")
    }
}

fun main() {
    val cart = ShoppingCart()

    // Using PayPal
    cart.setPaymentStrategy(PayPalStrategy("john@example.com"))
    cart.checkout(150.0)

    // Switching to Credit Card
    cart.setPaymentStrategy(CreditCardStrategy("1234-5678-9876-5432"))
    cart.checkout(250.0)
}