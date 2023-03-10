package com.kgh.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener{
            val loginIntent = Intent(this,LoginActivity::class.java)
            startActivity(loginIntent)
        }

        joinBtn.setOnClickListener{
            val joinIntent = Intent(this,JoinActivity::class.java)
            startActivity(joinIntent)
        }


    }
}