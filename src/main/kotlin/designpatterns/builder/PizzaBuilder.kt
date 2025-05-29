package com.example.testproject.designpatterns.builder


/**
 * The Builder Pattern is a creational design pattern that allows you to construct
 * complex objects step by step, separating the construction logic from the object’s
 * representation.
 */

//Product
class Pizza(
    val size: String,
    val cheese: Boolean,
    val pepperoni: Boolean,
    val mushroom: Boolean,
) {
    //Builder class
    class Builder(private val size: String) {
        private var cheese: Boolean = false
        private var pepperoni: Boolean = false
        private var mushroom: Boolean = false

        fun addCheese() = apply { cheese = true }
        fun addPepperoni() = apply { pepperoni = true }
        fun addMushroom() = apply { mushroom = true }
        fun build() = Pizza(size, cheese, pepperoni, mushroom)

    }

}

fun main() {
     Pizza
        .Builder("Large")
        .addMushroom()
        .addCheese()
        .addPepperoni()
        .build()
}