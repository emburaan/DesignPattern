package com.example.testproject.designpatterns.repositorypattern

import com.example.testproject.designpatterns.repositorypattern.model.User

interface UserRepository {

    fun getUser(userDao: UserDao, apiServices: ApiServices): User
}