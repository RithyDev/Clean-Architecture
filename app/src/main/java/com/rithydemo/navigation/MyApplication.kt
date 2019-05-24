package com.rithydemo.navigation

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.room.Room
import com.rithydemo.navigation.database.AppDatabase
import com.rithydemo.navigation.di.module.appModule
import com.rithydemo.navigation.di.module.viewModelModule
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(appModule, viewModelModule)
        }
    }
}