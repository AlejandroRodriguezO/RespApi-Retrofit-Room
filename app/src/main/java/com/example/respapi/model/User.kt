package com.example.respapi.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Entity(tableName = "user")
data class User (
    @ColumnInfo(name = "name")  val name: String,
    @ColumnInfo(name = "lastName") val lastName: String,
    @ColumnInfo(name = "city") val city: String,
    @ColumnInfo(name = "thumbnail") val thumbnail: String,
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
)

@Dao
interface  UserDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)

    @Query("SELECT * FROM user ORDER BY id DESC")
    fun getAll(): LiveData<List<User>>

    @Delete
    fun delete(user:User)
}