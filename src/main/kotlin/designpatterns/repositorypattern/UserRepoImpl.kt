package com.example.testproject.designpatterns.repositorypattern

import com.example.testproject.designpatterns.repositorypattern.model.User

class UserRepoImpl : UserRepository {
    override fun getUser(userDao: UserDao, apiServices: ApiServices): User {
        var user = userDao.fetchUser(1)
        if (user == null) {
            user = apiServices.fetchUser(1)
            userDao.saveUser(user)
        }
        return user
    }
}