package com.example.testproject.designpatterns.factorypattern

/**
 * The Factory Pattern is a creational design pattern that provides an
 * interface for creating objects, but lets subclasses decide which class to instantiate.
 * It helps you avoid direct `new` (or `constructor`) calls in
 * your code and encapsulates the object creation logic.
 */
class UIElementFactory {

    fun createUIElement(type: String): UIElements {
        return when (type) {
            "Button" -> return Button()
            "TextView" -> return TextView()
            "checkBox" -> return CheckBox()
            else -> throw IllegalArgumentException("Invalid UI element type: $type")
        }
    }

}

fun main() {
    val uiElementFactory = UIElementFactory()
    uiElementFactory.createUIElement("Button")
}