package com.kgh.kotlin.Room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserInfo(
    @PrimaryKey(autoGenerate = true) val userID:Int?,
    @ColumnInfo val name:String?,
    @ColumnInfo val phoneNumber: String?,
    @ColumnInfo val loginId:String?,
    @ColumnInfo val password:String
)
