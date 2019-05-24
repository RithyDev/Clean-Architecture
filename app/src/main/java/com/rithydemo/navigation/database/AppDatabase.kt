package com.rithydemo.navigation.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rithydemo.navigation.database.dao.PhotoDao
import com.rithydemo.navigation.database.dao.UserDao
import com.rithydemo.navigation.database.model.Photo
import com.rithydemo.navigation.database.model.User

@Database(entities = [User::class, Photo::class], version = DatabaseConfigure.VERSION)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    abstract fun photoDao(): PhotoDao
}