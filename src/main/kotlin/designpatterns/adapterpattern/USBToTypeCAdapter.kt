package com.example.testproject.designpatterns.adapterpattern

/**
 * The Adapter Pattern is a structural design pattern that allows objects
 * with incompatible interfaces to work together by providing a wrapper (adapter)
 * that translates one interface into another expected by the client.
 */
class USBToTypeCAdapter(val usb: USB) : TypeC {

    override fun connectTypeC() {
        usb.connectUSb()
        println("USB device is converted to type C.")
    }
}

fun main() {
    val usb = USB()
    val adapter = USBToTypeCAdapter(usb)
    adapter.connectTypeC()
}