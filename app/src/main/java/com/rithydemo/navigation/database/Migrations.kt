package com.rithydemo.navigation.database

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("ALTER TABLE USER ADD COLUMN age INTEGER")
    }
}

val MIGRATION_2_3 = object : Migration(2, 3) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("CREATE TABLE Photo (`id` INTEGER NOT NULL, `imageUrl` TEXT, PRIMARY KEY(id))")
    }
}