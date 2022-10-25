package com.example.respapi.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.respapi.model.User
import com.example.respapi.model.UserDao

@Database(entities = [User::class], version = 1)
abstract class DbDataSource : RoomDatabase() {

    abstract fun userDao(): UserDao
}