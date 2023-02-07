package com.kgh.kotlin.Room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserInfo::class], version = 1)
abstract class UserDB : RoomDatabase() {
    abstract fun getDao():UserDao
}