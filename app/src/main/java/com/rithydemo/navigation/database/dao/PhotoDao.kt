package com.rithydemo.navigation.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.rithydemo.navigation.database.model.Photo

@Dao
interface PhotoDao {

    @Query("SELECT * FROM Photo")
    suspend fun findAll(): List<Photo>
}