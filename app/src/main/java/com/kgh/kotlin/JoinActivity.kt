package com.kgh.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.kgh.kotlin.Room.UserDB
import com.kgh.kotlin.Room.UserInfo
import kotlinx.android.synthetic.main.activity_join.*
import kotlinx.android.synthetic.main.activity_login.*

class JoinActivity : AppCompatActivity() {
    lateinit var db: UserDB
    var value = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        db = Room.databaseBuilder(this, UserDB::class.java, "UserDB").allowMainThreadQueries().build()

        joinCompleteBtn.setOnClickListener{

            valueCheck()
            if (value.equals("1")){
                joinUser()
                val mainIntent = Intent(this,MainActivity::class.java)
                startActivity(mainIntent)
            }



        }

    }

    private fun valueCheck() {
        var name = edName.text.toString()
        var phone = edPhone.text.toString()
        var loginId = edLoginId.text.toString()
        var loginPw = edLoginPw.text.toString()
        if (name == ""){
            Toast.makeText(this,"이름을 입력해 주세요",Toast.LENGTH_LONG)
            if (phone == ""){
                Toast.makeText(this,"핸드폰번호를 입력해 주세요",Toast.LENGTH_LONG)
                if (loginId == ""){
                    Toast.makeText(this,"로그인ID를 입력해 주세요",Toast.LENGTH_LONG)
                    if (loginPw == ""){
                        Toast.makeText(this,"로그인PW를 입력해 주세요",Toast.LENGTH_LONG)
                        value = "1"
                    }
                }
            }
        }
    }

    private fun joinUser() {
        var name = edName.text.toString()
        var phone = edPhone.text.toString()
        var loginId = edLoginId.text.toString()
        var loginPw = edLoginPw.text.toString()
        val userID = db.getDao().makePK().size + 1
        db.getDao().joinUser(UserInfo(userID ,name, phone,loginId,loginPw))
    }
}