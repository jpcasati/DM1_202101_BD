package com.example.dm1_202101_bd

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ItemDAO {

    @Insert
    fun salvar(i: Item)

    @Query("SELECT * FROM Item")
    fun listar(): List<Item>

}