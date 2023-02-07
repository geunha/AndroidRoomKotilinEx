package com.kgh.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.kgh.kotlin.Room.UserDB
import com.kgh.kotlin.Room.UserInfo

class LoginActivity : AppCompatActivity() {
    lateinit var db: UserDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        db = Room.databaseBuilder(this, UserDB::class.java, "UserDB").allowMainThreadQueries().build()


    }



}