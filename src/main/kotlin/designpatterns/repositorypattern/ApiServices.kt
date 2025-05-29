package com.example.testproject.designpatterns.repositorypattern

import com.example.testproject.designpatterns.repositorypattern.model.User

class ApiServices {
    fun fetchUser(id: Int): User {
        // Fetch user from Api
        return User("John Doe", 30, 1)

    }
}