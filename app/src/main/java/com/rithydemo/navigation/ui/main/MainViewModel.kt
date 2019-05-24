package com.rithydemo.navigation.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.rithydemo.navigation.base.BaseViewModel
import com.rithydemo.navigation.database.AppDatabase
import com.rithydemo.navigation.database.model.User
import com.rithydemo.navigation.database.repository.UserRepository
import kotlinx.coroutines.launch

class MainViewModel(database: AppDatabase) : BaseViewModel() {

    val users = MutableLiveData<List<User>>()

    private val userRepo = UserRepository(dao = database.userDao())

    override fun onCreate() {

        viewModelScope.launch {
            val result = userRepo.test3()
            users.value = result
        }
    }
}