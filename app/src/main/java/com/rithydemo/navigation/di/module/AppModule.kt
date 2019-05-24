package com.rithydemo.navigation.di.module

import androidx.room.Room
import com.rithydemo.navigation.database.AppDatabase
import com.rithydemo.navigation.database.DatabaseConfigure
import com.rithydemo.navigation.database.MIGRATION_1_2
import com.rithydemo.navigation.database.MIGRATION_2_3
import org.koin.dsl.module

val appModule = module {

    single { Room.databaseBuilder(get(), AppDatabase::class.java, DatabaseConfigure.NAME)
            .addMigrations(MIGRATION_1_2, MIGRATION_2_3)
            .build() }
}