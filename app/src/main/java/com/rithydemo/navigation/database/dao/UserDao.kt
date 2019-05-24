package com.rithydemo.navigation.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.rithydemo.navigation.database.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM USER")
    suspend fun findAll(): List<User>

    @Query("SELECT * FROM USER WHERE ID IN (:userIds)")
    suspend fun loadAllByIds(userIds: IntArray): List<User>

    @Query("SELECT * FROM USER WHERE ID = :id")
    suspend fun findById(id: Int): User

    @Insert
    suspend fun insert(vararg users: User)
}