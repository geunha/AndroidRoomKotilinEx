package com.kgh.kotlin.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Insert
    fun joinUser(userInfo: UserInfo)

    @Query("select * from UserInfo where loginId and password" )
    fun loginCheck(loginId: String,password:String):String

    @Query("select * from UserInfo" )
    fun makePK():List<String>
}