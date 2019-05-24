package com.rithydemo.navigation.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Photo(
        @PrimaryKey
        val id: Int,
        @ColumnInfo(name = "imageUrl") var imageUrl: String?
)