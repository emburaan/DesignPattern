package com.example.testproject.designpatterns.facade

//Facade
class UserManagerFacade(
    val storage: Storage,
    val logger: Logger,
    val notifier: Notifier
) {

    fun saveUser(){
        storage.saveData("User Data")
        logger.logEvent("User saved")
        notifier.notifyUser("User saved successfully")
    }

}


//Client
fun main() {
    val storage = Storage()
    val logger = Logger()
    val notifier = Notifier()

    val userManagerFacade = UserManagerFacade(storage, logger, notifier)
    userManagerFacade.saveUser()

}