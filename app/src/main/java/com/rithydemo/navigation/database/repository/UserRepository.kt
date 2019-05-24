package com.rithydemo.navigation.database.repository

import android.util.Log
import com.rithydemo.navigation.database.dao.UserDao
import com.rithydemo.navigation.database.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class UserRepository(private val dao: UserDao) {

    fun test() {
        runBlocking {
            val values = dao.findAll()
            Log.d(">>>>", values.size.toString())
        }
    }

    suspend fun test2(): List<User> {
        return dao.findAll()
    }

    suspend fun test3() = withContext(Dispatchers.IO) {
        dao.findAll()
    }

    suspend fun insertUser(vararg users: User) = withContext(Dispatchers.IO) {
        dao.insert(*users)
    }
}