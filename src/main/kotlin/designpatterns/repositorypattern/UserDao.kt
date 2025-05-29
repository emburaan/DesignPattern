package com.example.testproject.designpatterns.repositorypattern

import com.example.testproject.designpatterns.repositorypattern.model.User

class UserDao {

    fun fetchUser(id: Int): User? {
        // Fetch user from database
        return User("John Doe", 30, 1)
    }

    fun saveUser(user: User) {
        println("Saved the User")
    }
}