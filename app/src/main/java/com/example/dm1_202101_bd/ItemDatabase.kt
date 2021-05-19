package com.example.dm1_202101_bd

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class ItemDatabase : RoomDatabase() {

    companion object {

        private var database: ItemDatabase? = null

        private val DATABASE = "ItemBD"

        fun getInstance(context: Context): ItemDatabase? {

            if(database == null)
                return criaBanco(context)
            else
                return database

        }

        private fun criaBanco(context: Context): ItemDatabase {
            return Room.databaseBuilder(context, ItemDatabase::class.java, DATABASE)
                .allowMainThreadQueries()
                .build()
        }
    }
}